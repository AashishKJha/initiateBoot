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
    public ResponseEntity<AppException> handleException(MethodArgumentNotValidException exception) {
        List<FieldError> errors = exception.getBindingResult().getFieldErrors();
        System.out.println(errors.size());
        if (errors.size() == 1) {
            return new ResponseEntity<>(AppException.createException(errors.get(0).getCode(), errors.get(0).getField(), errors.get(0).getDefaultMessage(), LocalDate.now()), HttpStatus.BAD_REQUEST);
        } else {
            ArrayList<AppException> exp = new ArrayList<>();
            errors.forEach(d -> {
                AppException e = new AppException();
                e.setErrorCode(d.getCode());
                e.setErrorField(d.getField());
                e.setErrorMessage(d.getDefaultMessage());
                e.setTimaStamp(LocalDate.now());
                exp.add(e);
            });
            return new ResponseEntity<>(AppException.createException(exp, LocalDate.now()), HttpStatus.BAD_REQUEST);
        }
    }

    @ExceptionHandler(AppException.class)
    @ResponseBody
    public ResponseEntity<ClientResponse> appException(AppException information) {
        return new ResponseEntity<>(ClientResponse.createFailure(false, information.getMessage()), HttpStatus.NOT_FOUND);
    }
}
