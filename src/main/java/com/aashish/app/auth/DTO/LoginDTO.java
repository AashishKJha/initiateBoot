package com.aashish.app.auth.DTO;

import javax.validation.constraints.*;

public class LoginDTO {

    private String userName;

    @NotEmpty
    @NotNull
    private String userPassword;

    @NotEmpty
    @Email
    @NotNull
    private String userEmail;

    private String userMobNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobNumber() {
        return userMobNumber;
    }

    public void setUserMobNumber(String userMobNumber) {
        this.userMobNumber = userMobNumber;
    }
}
