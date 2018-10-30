package com.aashish.app.auth.helper;

import com.aashish.app.common.response.ClientResponse;

public class AuthResponse extends ClientResponse {

    private AuthResponse(boolean success, String message) {
        super(success, message);
    }

    public static AuthResponse createSuccess(boolean success, String message) {
        return new AuthResponse(success, message);
    }

    public static AuthResponse createFailure(boolean success, String message) {
        return new AuthResponse(success, message);
    }
}
