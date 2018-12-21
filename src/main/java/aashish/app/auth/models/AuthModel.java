package aashish.app.auth.models;

import aashish.app.common.models.AuditModel;
import org.springframework.stereotype.Component;

import javax.persistence.*;
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
    @Column(name = "user_id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auth_sequence")
    private Long userId;

    @Column(name = "user_first_name", columnDefinition = "VARCHAR(30)", nullable = false)
    private String userFirstName;

    @Column(name = "user_middle_name", columnDefinition = "VARCHAR(30)")
    private String userMiddleName;

    @Column(name = "user_last_name", columnDefinition = "VARCHAR(30)", nullable = false)
    private String userLastName;

    @Column(name = "user_email", columnDefinition = "VARCHAR(50)", updatable = false, nullable = false, unique = true, length = 30)
    private String userEmail;

    @Column(
            name = "user_password", nullable = false
    )
    private String userPassword;

    @Column(name = "user_mob_number", nullable = false, updatable = false, columnDefinition = "CHAR(15)", unique = true)
    private String userMobileNumber;

    @Column(name = "user_DOB", nullable = false, updatable = false)
    private LocalDate userDOB;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserMiddleName() {
        return userMiddleName;
    }

    public void setUserMiddleName(String userMiddleName) {
        this.userMiddleName = userMiddleName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
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

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public LocalDate getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(LocalDate userDOB) {
        this.userDOB = userDOB;
    }
}

