package ex_17_Enum;

public class Lab0151_Enum_Practice3 {
    public static void main(String[] args) {

        System.out.println("QA URL: " + ENV.QA.getBaseURL());

        // Here I can write the QA code
        if (ENV.QA.getBaseURL().equalsIgnoreCase("https://QA.myapp.com")){
            System.out.println("Start on QA!!");
        }
    }
}

enum ENV {
    DEV("https://dev.myapp.com"),
    QA("https://QA.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PREPROD("https://preprod.myapp.com"),
    UAT("https://uat.myapp.com"),
    PROD("https://myapp.com");

    private String baseURL;

    ENV(String baseURl) {
        this.baseURL = baseURl;
    }
    public String getBaseURL() {
        return this.baseURL;
    }
}