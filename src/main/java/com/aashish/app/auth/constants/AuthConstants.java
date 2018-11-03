package com.aashish.app.auth.constants;

import com.aashish.app.common.constants.Enums;

public class AuthConstants implements Enums {
    enum ErrorsConstants {
        INVALID_EMAIL("Invalid Email"),
        INVALID_PASSWORD("Invalid Password"),
        INVALID_MOBILE("Invalid Mobile");

        ErrorsConstants(String s) {
        }
    }

    enum SuccessConstants {

    }
}
