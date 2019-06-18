package initiateBoot.app.common.helper;

import java.time.LocalDate;
import java.util.List;

public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String errorCode;
    private String errorMessage;
    private String errorField;
    private LocalDate timaStamp;
    private List errorData;

    public AppException() {
    }

    public AppException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.timaStamp = LocalDate.now();
    }


    private AppException(String errorCode, String errorField, String errorMessage, LocalDate timeStamp) {
        this.errorCode = errorCode;
        this.errorField = errorField;
        this.errorMessage = errorMessage;
        this.timaStamp = timeStamp;
    }

    private AppException(List data, LocalDate timeStamp) {
        this.timaStamp = timeStamp;
        this.errorData = data;
    }

    public static AppException createException(String errorCode, String errorField, String errorMessage, LocalDate timeStamp) {
        return new AppException(errorCode, errorField, errorMessage, timeStamp);
    }

    public static AppException createException(String errorMessage) {
        return new AppException(errorMessage);
    }

    public static AppException createException(List data, LocalDate timeStamp) {
        return new AppException(data, timeStamp);
    }

    public static AppException createException(String errorCode, String errorMessage) {
        AppException appException = new AppException(errorMessage);
        appException.setErrorCode(errorCode);
        return appException;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorField() {
        return errorField;
    }

    public List getErrorData() {
        return errorData;
    }
}
