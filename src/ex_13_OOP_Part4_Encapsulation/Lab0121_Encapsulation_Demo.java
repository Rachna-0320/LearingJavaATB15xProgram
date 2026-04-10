package ex_13_OOP_Part4_Encapsulation;

public class Lab0121_Encapsulation_Demo {
    public static void main(String[] args) {

        GoodVWOLogin gl = new GoodVWOLogin("Admin", "@123");
        System.out.println("Username: " + gl.getUsername());
        System.out.println("Password: " + gl.getPassword());
        gl.setPassword("@abc");
        System.out.println("New Password: " + gl.getPassword());
    }
}

class GoodVWOLogin {
    private String username;
    private String password;

    // Setter methods
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}