package com.aashish.app.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationErrorResponse {
    @JsonProperty(value = "errorCode")
    private String errorCode;

    @JsonProperty(value = "errorFeild")
    private String errorFeild;

    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    public ValidationErrorResponse() {
    }

    private ValidationErrorResponse(String errorCode, String errorFeild, String errorMessage) {
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorFeild(String errorFeild) {
        this.errorFeild = errorFeild;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
