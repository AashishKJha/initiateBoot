package initiateBoot.app.common.helper;

import initiateBoot.app.common.security.LoginUserData;

public class StoreLoginUser {
    private Long userId;
    private String userEmail;
    private String userName;
    private String userMobNumber;

    public StoreLoginUser(LoginUserData loginUserData) {
        this.userId = loginUserData.getUserId();
        this.userEmail = loginUserData.getUserEmail();
        this.userName = loginUserData.getUserFirstName();
        this.userMobNumber = loginUserData.getUserMobileNumber();
    }

    public StoreLoginUser() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobNumber() {
        return userMobNumber;
    }

    public void setUserMobNumber(String userMobNumber) {
        this.userMobNumber = userMobNumber;
    }
}
