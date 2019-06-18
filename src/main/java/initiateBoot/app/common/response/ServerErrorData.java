package initiateBoot.app.common.response;

public class ServerErrorData {
    private ServerErrorMessage serverErrorMessage;

    public ServerErrorMessage getServerErrorMessage() {
        return serverErrorMessage;
    }

    public void setServerErrorMessage(ServerErrorMessage serverErrorMessage) {
        this.serverErrorMessage = serverErrorMessage;
    }

    public String getSqlstate() {
        return sqlstate;
    }

    public void setSqlstate(String sqlstate) {
        this.sqlstate = sqlstate;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    private String sqlstate;
    private int errorCode;

}
