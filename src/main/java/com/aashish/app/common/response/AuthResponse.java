package com.aashish.app.common.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthResponse {

    @JsonProperty(value = "success")
    private boolean success;

    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "error")
    private String error;

    private AuthResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    private AuthResponse(boolean success, String message, String error) {
        this.success = success;
        this.message = message;
        this.error = error;
    }

    public static AuthResponse createSuccess(boolean success, String message) {
        return new AuthResponse(success, message);
    }

    public static AuthResponse createFailure(boolean success, String message, String error) {
        return new AuthResponse(success, message, error);

    }
}
