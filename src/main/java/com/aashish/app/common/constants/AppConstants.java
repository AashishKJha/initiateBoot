package com.aashish.app.common.constants;

import org.springframework.http.HttpStatus;

public class AppConstants implements Enums {
    public static final String UNAUTHORIZED_ERROR_CODE = HttpStatus.UNAUTHORIZED.toString();
    public static final String USER_NOT_FOUND = "User Not Found";

    //-----------Headers Types
    public static final String APPLICATION_JSON = "application/json";

}
