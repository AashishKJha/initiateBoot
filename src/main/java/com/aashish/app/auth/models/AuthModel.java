package com.aashish.app.auth.models;

import com.aashish.app.common.models.AuditModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "auth_table")
@SequenceGenerator(
        name = "auth_sequence",
        sequenceName = "auth_sequence",
        initialValue = 1000
)

public class AuthModel extends AuditModel {

    @Id
    @Column(name = "user_id", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auth_sequence")
    private Long userId;

    @Column(name = "user_name", columnDefinition = "VARCHAR(20)", nullable = false)
    private String userName;

    @Column(name = "user_email", columnDefinition = "VARCHAR(40)", updatable = false, nullable = false, unique = true, length = 30)
    private String userEmail;

    @Column(
            name = "user_password", nullable = false, columnDefinition = "VARCHAR(20)"
    )
    private String userPassword;

    @NotNull(message = "Should not be null")
    @Column(name = "user_mob_number", nullable = false, columnDefinition = "CHAR(15)", unique = true)
    private String userMobileNumber;

    @Column(name = "user_DOB", nullable = false)
    private LocalDate userDOB;

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public LocalDate getUserDOB() {
        return userDOB;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public void setUserDOB(LocalDate userDOB) {
        this.userDOB = userDOB;
    }
}

