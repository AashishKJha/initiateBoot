package aashish.app.common.security;

import aashish.app.common.constants.AppConstants;
import aashish.app.common.constants.Enums;

class SecurityConstants extends AppConstants implements Enums {

    static final long ACCESS_TOKEN_EXPIRATION_TIME = 100000; // 10 days
    static final long REFRESH_TOKEN_EXPIRATION_TIME = 10000000; // 10 days
    static final String SECRET = "3671575SFGSGSGSS#@#@##@";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";
    static final String SIGN_UP_URL = "/api/auth/register";
    static final String LOG_IN_URL = "/api/auth/login";
    static final String TOKEN_REFRESH_ENTRY_POINT = "/api/auth/token";
    static final String PUBLIC_ENTRY_POINT = "/public/**";
    static final String USER_DOES_NOT_EXITS = "USER_DOES_NOT_EXITS";
    static final String USER_NAME_NOT_FOUND = "USER_NAME_NOT_FOUND";
    static final String USER_PASSWORD_NOT_FOUND = "USER_PASSWORD_NOT_FOUND";
    static final String INVALID_USER = "INVALID_USER";
    static final String BAD_CREDENTIALS = "BAD_CREDENTIALS";
}
