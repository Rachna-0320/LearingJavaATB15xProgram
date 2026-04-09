package ex_12_OOPs_Part3.Polymorphism;

public class Lab0120_MethodOverriding_Automation {
    public static void main(String[] args) {

        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1 = new FirefoxTC();
        f1.openBrowser();

        CommonToAll common = new CommonToAll();
        common.openBrowser();

      //  Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new FirefoxTC();
        c3.openBrowser();
    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting a default browser");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting the Chrome browser");
    }
}

class FirefoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting the Firefox browser");
    }
}
