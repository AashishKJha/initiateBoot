package aashish.app.common.security;

import aashish.app.auth.models.AuthModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDate;
import java.util.Collection;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginUserData extends User {

    @JsonProperty
    private Long userId;

    @JsonProperty
    private String userFirstName;

    @JsonProperty
    private String userMiddleName;

    @JsonProperty
    private String userLastName;

    @JsonProperty
    private String userEmail;
    @JsonProperty
    private String userMobileNumber;

    @JsonProperty
    private LocalDate userDOB;

    LoginUserData(AuthModel authModel, String userEmail, String password, Collection<? extends GrantedAuthority> authorities) {
        super(userEmail, password, authorities);
        this.userId = authModel.getUserId();
        this.userMobileNumber = authModel.getUserMobileNumber();
        this.userFirstName = authModel.getUserFirstName();
        this.userMiddleName = authModel.getUserMiddleName();
        this.userLastName = authModel.getUserLastName();
        this.userEmail = authModel.getUserEmail();
        this.userDOB = authModel.getUserDOB();
    }

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
