package xyz.kyngs.fakturoid.api.v3.impl.okhttp4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import okhttp3.*;
import xyz.kyngs.fakturoid.api.v3.FakturoidClient;
import xyz.kyngs.fakturoid.api.v3.client.subjects.SubjectsClient;
import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicesClient;
import xyz.kyngs.fakturoid.api.v3.exception.APIException;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.invoices.OKHTTP4InvoicesClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.subjects.OKHTTP4SubjectsClient;
import xyz.kyngs.fakturoid.api.v3.model.auth.OAuthToken;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Map;

public class OKHTTP4FakturoidClient implements FakturoidClient {

    private final OkHttpClient client;
    private final ObjectMapper objectMapper = JsonMapper.builder()
            .build();
    private final Object tokenLock = new Object();
    private final String baseURL;
    private final String userAgent;

    // Used to call the /oauth/token endpoint
    private final String tokenRequestAuthorizationHeader;

    private String tokenHeader;
    private LocalDateTime tokenExpiration = LocalDateTime.MIN;

    private OKHTTP4FakturoidClient(String baseURL, String userAgent, String clientId, String clientSecret) {
        this.baseURL = baseURL;
        this.userAgent = userAgent;

        tokenRequestAuthorizationHeader = Base64.getUrlEncoder().encodeToString(
                (clientId + ":" + clientSecret).getBytes()
        );

        this.client = new OkHttpClient.Builder()
                .build();

        verifyToken();
    }

    @Override
    public void refreshToken() {
        synchronized (tokenLock) {
            var res = execute(createRequest("/oauth/token", tokenRequestAuthorizationHeader)
                    .post(jsonBody(Map.of(
                            "grant_type", "client_credentials"
                    ))), OAuthToken.class);

            tokenHeader = res.tokenType() + " " + res.accessToken();
            tokenExpiration = LocalDateTime.now().plusSeconds(res.expiresIn());
        }
    }

    @Override
    public void verifyToken() {
        synchronized (tokenLock) {
            // If the token is about to expire, refresh it
            if (LocalDateTime.now().isAfter(tokenExpiration.minusMinutes(1))) {
                refreshToken();
            }
        }
    }

    @Override
    public InvoicesClient invoices(String account) {
        return new OKHTTP4InvoicesClient(this, account);
    }

    @Override
    public SubjectsClient subjects(String account) {
        return new OKHTTP4SubjectsClient(this, account);
    }

    public Request.Builder createRequest(String path) {
        return createRequest(tokenHeader, path);
    }

    public Request.Builder createRequest(String tokenHeader, String path) {
        return new Request.Builder()
                .url(baseURL + path)
                .header("Authorization", tokenHeader)
                .header("User-Agent", userAgent)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json");
    }

    public RequestBody jsonBody(Object object) {
        try {
            return RequestBody.create(
                    objectMapper.writeValueAsString(object),
                    okhttp3.MediaType.parse("application/json")
            );
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public  <T> T parseJson(ResponseBody body, Class<T> clazz) {
        try {
            return objectMapper.readValue(body.string(), clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Response execute(Request.Builder request) {
        try  {
            var res = client.newCall(request.build()).execute();

            if (!res.isSuccessful() && res.code() != 404) {
                //noinspection DataFlowIssue
                throw new APIException(res.code(), res.body().string());
            }
            return res;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T execute(Request.Builder request, Class<T> clazz) {
        try (var res = execute(request)) {
            if (res.code() == 404) {
                return null;
            }
            //noinspection DataFlowIssue
            return parseJson(res.body(), clazz);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String baseURL;
        private String userAgent;
        private String clientId;
        private String clientSecret;

        private Builder() {
        }

        public Builder baseURL(String baseURL) {
            this.baseURL = baseURL;
            return this;
        }

        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public OKHTTP4FakturoidClient build() {
            return new OKHTTP4FakturoidClient(baseURL, userAgent, clientId, clientSecret);
        }
    }
}
