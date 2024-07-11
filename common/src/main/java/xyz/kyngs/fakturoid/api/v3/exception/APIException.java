package xyz.kyngs.fakturoid.api.v3.exception;

import java.net.URL;

public class APIException extends RuntimeException {
    private final int code;
    private final String data;

    public APIException(URL url, int code, String data, String requestData) {
        super("API request " + requestData + " to " + url + " failed with code " + code + " with data: " + data);
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getData() {
        return data;
    }
}
