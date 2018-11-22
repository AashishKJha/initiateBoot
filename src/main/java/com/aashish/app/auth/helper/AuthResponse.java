package com.aashish.app.auth.helper;

import com.aashish.app.common.response.ClientResponse;

import java.util.Map;

public class AuthResponse extends ClientResponse {

    private AuthResponse(boolean success, String message) {
        super(success, message);
    }

    private AuthResponse(boolean success, Object data) {
        super(success, data);
    }

    private AuthResponse(boolean success, Map data) {
        super(success, data);
    }


    public static AuthResponse createSuccess(boolean success, String message) {
        return new AuthResponse(success, message);
    }

    public static AuthResponse createSuccess(boolean success, Object data) {
        return new AuthResponse(success, data);
    }

    public static AuthResponse createFailure(boolean success, String message) {
        return new AuthResponse(success, message);
    }
}
