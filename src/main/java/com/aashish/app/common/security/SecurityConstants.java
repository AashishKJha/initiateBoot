package com.aashish.app.common.security;

import com.aashish.app.common.constants.Enums;

class SecurityConstants implements Enums {
    static final long EXPIRATIONTIME = 100000; // 10 days
    static final String SECRET = "3671575SFGSGSGSS#@#@##@";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";
    static final String SIGN_UP_URL = "/api/auth/register";
    static final String LOG_IN_URL = "/api/auth/login";
}
