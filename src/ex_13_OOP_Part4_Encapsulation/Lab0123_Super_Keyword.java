package ex_13_OOP_Part4_Encapsulation;

public class Lab0123_Super_Keyword {
    public static void main(String[] args) {
        testCase t = new testCase();
        System.out.println("Browser: " + t.getBrowser());
        t.test();
    }
}

class superClass{
    private String browser;

    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }
    superClass(){
        System.out.println("Default superclass");
    }

    superClass(String browser){
        this.browser = browser;
        System.out.println("Parameterized Superclass Constructor");
    }
}

class testCase extends superClass {
    testCase() {
        super("Chrome");   // using super keyword
        System.out.println("Subclass Constructor");
    }

    void test() {
        System.out.println("Executing Test Case");
    }
}