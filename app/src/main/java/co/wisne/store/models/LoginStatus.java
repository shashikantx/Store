package co.wisne.store.models;

/**
 * Created by Shashikant on 12-03-2018.
 */

public class LoginStatus {

    public static String SUCCESS = "success";

    String status;
    String message;
    String apiKey;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getApiKey() {
        return apiKey;
    }
}
