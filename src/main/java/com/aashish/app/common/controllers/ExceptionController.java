package com.aashish.app.common.controllers;

import com.aashish.app.common.helper.AppException;
import com.aashish.app.common.response.ClientResponse;
import com.aashish.app.common.response.ValidationErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public ResponseEntity<ClientResponse> handleException(MethodArgumentNotValidException exception) {

        List<FieldError> errors = exception.getBindingResult().getFieldErrors();

        ArrayList<ValidationErrorResponse> exp = new ArrayList<>();

        errors.forEach(d -> {
            ValidationErrorResponse e = new ValidationErrorResponse();
            e.setErrorCode(d.getCode());
            e.setErrorFeild(d.getField());
            e.setErrorMessage(d.getDefaultMessage());
            exp.add(e);
        });

        return new ResponseEntity<>(ClientResponse.createFailure(false, exp), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(AppException.class)
    @ResponseBody
    public ResponseEntity<ClientResponse> appException(AppException information) {
        return new ResponseEntity<>(ClientResponse.createFailure(false, information.getLocalizedMessage()), HttpStatus.NOT_FOUND);
    }
}
