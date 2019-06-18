package initiateBoot.app.users.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    @JsonProperty
    private String userFirstName;

    @JsonProperty
    private String userMiddleName;

    @JsonProperty
    private String userLastName;

    @JsonProperty
    private String userEmail;

    @JsonProperty
    private String userMobNumber;

    @JsonProperty
    private LocalDate userDOB;

    @JsonProperty
    private Long userId;

    public UserDTO() {

    }

    public UserDTO(String userFirstName, String userMiddleName, String userLastName) {
        this.userFirstName = userFirstName;
        this.userMiddleName = userMiddleName;
        this.userLastName = userLastName;
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
