package Aug_Ex_17082024;

//public class API_Constants {

public enum API_Constants {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");


    private final String name;

    API_Constants(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }
}
