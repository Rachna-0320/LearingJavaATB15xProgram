package ex_21_Collection_Framework_Queue_Map;

import java.util.*;

public class Lab0184_HashTable_Example {
    public static void main(String[] args) {

        Map<String, String>  envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("staging", "https://staging.api.com");
        envConfig.put("dev", "https://dev.api.com");
        envConfig.put("preprod", "https://preprod.api.com");
        envConfig.put("uat", "https://uat.api.com");

        System.out.println(envConfig);

        // Managing user credentials
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("user", "user123");
        credentials.put("user", null);
        credentials.put("user2", null);

        System.out.println(credentials);

        // Sending the data from Map to JSON, JSON to Map -> API Automation
        // Web Selenium - store the Web elements with keys.



    }
}
