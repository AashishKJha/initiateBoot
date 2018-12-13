package com.aashish.app.users.DTO;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class UserDTO {
    @Valid
    @NotNull
    private String userName;

    @NotNull
    @NotEmpty
    @NotBlank
    @Email
    @Size(max = 30, min = 10)
    private String userEmail;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 15, min = 10)
    private String userMobNumber;


    @NotNull
    private LocalDate userDOB;

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

    public LocalDate getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(LocalDate userDOB) {
        this.userDOB = userDOB;
    }
}
