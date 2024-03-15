package xyz.kyngs.fakturoid.api.v3.exception;

public class APIException extends RuntimeException {
    private final int code;
    private final String data;

    public APIException(int code, String data) {
        this.code = code;
        this.data = data;
    }
}
