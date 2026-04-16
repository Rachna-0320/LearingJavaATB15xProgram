package ex_15_Static;

public class Lab0133_Static_Automation {
    public static void main(String[] args) {

        Automation a = new Automation();
        System.out.println(a.driver);
        System.out.println(a.driver2);
        Automation.driver = "Opera";
        System.out.println( Automation.driver);
        System.out.println( Automation.driver2);
    }
}

class Automation{
    static String driver = "Chrome";
    static String driver2 = "Firefox";

}