package com.aashish.app.common.helper;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;

public class ErrorHelper {
    private LocalDate timeStamp;

    private String message;

    private String details;

    public ErrorHelper(LocalDate date, String message, String details) {
        super();
        this.details = details;
        this.message = message;
        this.timeStamp = date;
    }
}

class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

}
