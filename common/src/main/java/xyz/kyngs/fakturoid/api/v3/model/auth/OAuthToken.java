package xyz.kyngs.fakturoid.api.v3.model.auth;

public record OAuthToken(String accessToken, String tokenType, int expiresIn) {
}