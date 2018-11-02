package com.aashish.app.common.helper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "errCode")
    private String errorCode;

    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    @JsonProperty(value = "errorField")
    private String errorField;

    @JsonProperty(value = "timeStamp")
    private LocalDate timaStamp;

    @JsonProperty(value = "errorData")
    private List errorData;

    public AppException() {
    }

    public AppException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.timaStamp = LocalDate.now();
    }


    private AppException(String errorCode, String errorField, String errorMessage, LocalDate timeStamp) {
        this.errorCode = errorCode;
        this.errorField = errorField;
        this.errorMessage = errorMessage;
        this.timaStamp = timeStamp;
    }

    private AppException(List data, LocalDate timeStamp) {
        this.timaStamp = timeStamp;
        this.errorData = data;
    }

    public static AppException createException(String errorCode, String errorField, String errorMessage, LocalDate timeStamp) {
        return new AppException(errorCode, errorField, errorMessage, timeStamp);
    }

    public static AppException createException(String errorMessage) {
        return new AppException(errorMessage);
    }

    public static AppException createException(List data, LocalDate timeStamp) {
        return new AppException(data, timeStamp);
    }


}
