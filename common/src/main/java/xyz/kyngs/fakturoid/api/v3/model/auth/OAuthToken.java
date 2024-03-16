package xyz.kyngs.fakturoid.api.v3.model.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

public record OAuthToken(@JsonProperty("access_token") String accessToken, @JsonProperty("token_type") String tokenType, @JsonProperty("expires_in") int expiresIn) {
}