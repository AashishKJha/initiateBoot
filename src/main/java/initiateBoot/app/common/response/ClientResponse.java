package initiateBoot.app.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientResponse {

    @JsonProperty(value = "success")
    private boolean success;

    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "data")
    private Object data;

    @JsonProperty(value = "error")
    private String error;

    @JsonProperty(value = "errorList")
    private List errorList;

    public ClientResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    private ClientResponse(boolean success, String message, String error) {
        this.success = success;
        this.message = message;
        this.error = error;
    }

    private ClientResponse(boolean success, List errorList) {
        this.success = success;
        this.errorList = errorList;
    }

    public ClientResponse(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public ClientResponse() {
    }

    public static ClientResponse createSuccess(boolean success, String message) {
        return new ClientResponse(success, message);
    }

    public static ClientResponse createFailure(boolean success, String message) {
        return new ClientResponse(success, message);
    }

    public static ClientResponse createFailure(boolean success, List errorList) {
        return new ClientResponse(success, errorList);
    }

    public static ClientResponse createFailure(boolean success, Object data) {
        return new ClientResponse(success, data);
    }
}
