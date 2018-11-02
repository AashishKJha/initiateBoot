package com.aashish.app.common.controllers;

import com.aashish.app.common.helper.AppException;
import com.aashish.app.auth.helper.AuthResponse;
import com.aashish.app.common.response.ClientResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler
    public ResponseEntity<ClientResponse> handleException(MethodArgumentNotValidException exception) {
        List<FieldError> errors = exception.getBindingResult().getFieldErrors();
        System.out.println(errors.size());
        if (errors.size() == 1) {
            return new ResponseEntity<>(ClientResponse.createFailure(false, errors.get(0).getDefaultMessage()), HttpStatus.BAD_REQUEST);
        } else {
            ArrayList<ClientResponse> exp = new ArrayList<>();
            errors.forEach(d -> {
                ClientResponse e = new ClientResponse();
                e.setError(d.getCode());
                e.setMessage(d.getDefaultMessage());
                exp.add(e);
            });
            return new ResponseEntity<>(ClientResponse.createFailure(false, exp), HttpStatus.BAD_REQUEST);
        }
    }

    @ExceptionHandler(AppException.class)
    @ResponseBody
    public ResponseEntity<ClientResponse> appException(AppException information) {
        return new ResponseEntity<>(ClientResponse.createFailure(false, information.getLocalizedMessage()), HttpStatus.NOT_FOUND);
    }
}
