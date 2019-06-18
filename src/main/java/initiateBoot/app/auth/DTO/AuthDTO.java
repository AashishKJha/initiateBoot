package initiateBoot.app.auth.DTO;

import initiateBoot.app.auth.models.AuthModel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AuthDTO {

    @Autowired
    private AuthModel authModel;

    @NotBlank
    @NotEmpty
    @NotNull
    @Size(max = 30)
    private String userFirstName;

    @NotBlank
    @NotEmpty
    @NotNull
    @Size(max = 30)
    private String userMiddleName;

    @NotBlank
    @NotEmpty
    @NotNull
    @Size(max = 30)
    private String userLastName;


    @NotNull
    @NotEmpty
    @NotBlank
    @Email
    @Size(max = 50)
    private String userEmail;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 15, min = 10)
    private String userMobNumber;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 30, min = 10)
    private String userPassword;

    @NotNull
    private LocalDate userDOB;

    public void setAuthModel(AuthModel authModel) {
        this.authModel = authModel;
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

    public void setUserDOB(LocalDate userDOB) {
        this.userDOB = userDOB;
    }

    public void setUserDOB(String userDOB) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.userDOB = LocalDate.parse(userDOB, dt);
    }
}
