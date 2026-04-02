package ex_10_OOPs;

public class LoginPage {
    //Constructor Overloading
    String email;
    String password;

    // Constructor 1
    LoginPage(){
        System.out.println("Default Constructor called");
    }

    // Constructor 2
    LoginPage(String emailGiven){
        this.email =emailGiven;
    }

    // Constructor 3
    LoginPage(String email, String password) {
        this.email = email;
        this.password =  password;
    }

    public static void main(String[] args) {
        LoginPage lp1 = new LoginPage();

        LoginPage lp2 = new LoginPage("user@gmail.com");
        System.out.println("Email: " + lp2.email);

        LoginPage lp3 = new LoginPage("user@gmail.com", "123");
        System.out.println("Email: " + lp3.email + ", Password: " + lp3.password);
    }
}
