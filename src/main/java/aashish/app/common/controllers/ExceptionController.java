package aashish.app.common.controllers;

import aashish.app.common.helper.AppException;
import aashish.app.common.response.ClientResponse;
import aashish.app.common.response.ValidationErrorResponse;
import org.postgresql.util.PSQLException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionController extends CommonController {

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
        return ResponseEntity.status(Integer.parseInt(information.getErrorCode())).body(ClientResponse.createFailure(false, information.getErrorMessage()));
    }

//    @ExceptionHandler(ExpiredJwtException.class)
//    @ResponseBody
//    public ResponseEntity<ClientResponse> serverException(ExpiredJwtException information) {
//        return new ResponseEntity<>(ClientResponse.createFailure(false, information.getLocalizedMessage()), HttpStatus.NOT_FOUND);
//    }

    @ExceptionHandler({RuntimeException.class, Exception.class})
    @ResponseBody
    public ResponseEntity technicalError(Throwable ex) throws IOException {

        System.out.println("Error : " + ex.toString());
        while (ex.getCause() != null) {
            ex = ex.getCause();
        }

        if (ex instanceof PSQLException) {

            ValidationErrorResponse vl = new ValidationErrorResponse();
            org.postgresql.util.ServerErrorMessage sve = ((PSQLException) ex).getServerErrorMessage();
            vl.setErrorFeild(sve.getColumn());
            vl.setErrorMessage(sve.getDetail());
            vl.setErrorCode(sve.getSQLState());
            return new ResponseEntity<ClientResponse>(ClientResponse.createFailure(false, vl), HttpStatus.INTERNAL_SERVER_ERROR);

        }

        ValidationErrorResponse vl = new ValidationErrorResponse();
        return new ResponseEntity<ClientResponse>(ClientResponse.createFailure(false, ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
