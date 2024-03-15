package xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client;

import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.OKHTTP4FakturoidClient;

public class OKHTTP4AbstractClient {
    protected final OKHTTP4FakturoidClient fakturoidClient;
    protected final String account;

    public OKHTTP4AbstractClient(OKHTTP4FakturoidClient fakturoidClient, String account) {
        this.fakturoidClient = fakturoidClient;
        this.account = account;
    }

    protected Request.Builder createRequest(String path) {
        return fakturoidClient.createRequest(path);
    }

    protected Request.Builder createRequest(String tokenHeader, String path) {
        return fakturoidClient.createRequest(tokenHeader, path);
    }

    protected RequestBody jsonBody(Object object) {
        return fakturoidClient.jsonBody(object);
    }

    protected <T> T parseJson(ResponseBody body, Class<T> clazz) {
        return fakturoidClient.parseJson(body, clazz);
    }

    protected Response execute(Request.Builder request) {
        return fakturoidClient.execute(request);
    }

    protected <T> T execute(Request.Builder request, Class<T> clazz) {
        return fakturoidClient.execute(request, clazz);
    }
}
