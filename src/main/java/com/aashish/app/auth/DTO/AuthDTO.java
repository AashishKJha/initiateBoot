package com.aashish.app.auth.DTO;

import com.aashish.app.auth.models.AuthModel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AuthDTO {

    @Autowired
    private AuthModel authModel;

    @NotNull
    private String userName;

    @NotNull
    @Size(max = 30)
    private String userEmail;

    @NotNull
    @Size(max = 15)
    private String userMobNumber;

    @NotNull
    private String userPassword;

    @NotNull
    private LocalDate userDOB;


    public void setAuthModel(AuthModel authModel) {
        this.authModel = authModel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDate getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.userDOB = LocalDate.parse(userDOB, dt);
    }
}
