package com.aashish.app.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientResponse {

    @JsonProperty(value = "success")
    private boolean success;

    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "error")
    private String error;

    public ClientResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    private ClientResponse(boolean success, String message, String error) {
        this.success = success;
        this.message = message;
        this.error = error;
    }

    public ClientResponse() {
    }

    public static ClientResponse createSuccess(boolean success, String message) {
        return new ClientResponse(success, message);
    }

    public static ClientResponse createFailure(boolean success, String message) {
        return new ClientResponse(success, message);

    }
}