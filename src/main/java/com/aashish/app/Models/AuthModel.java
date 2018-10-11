package com.aashish.app.Models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AuthModel {

    @Size(min = 10)
    @NotNull
    private String userName;

    @NotNull
    @Size(min = 8)
    private String password;

    @NotNull
    private String userEmail;

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

}





