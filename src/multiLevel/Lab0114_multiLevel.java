package multiLevel;

public class Lab0114_multiLevel {
    public static void main(String[] args) {

        Son Uttam = new Son();
        Uttam.home();
        Uttam.car();
        Uttam.extraMoney();
        Uttam.bhk3();
        System.out.println("=".repeat(10));

        Father f = new Father();
        f.home();
        f.car();
        f.extraMoney();
        System.out.println("=".repeat(10));

        GrandFather GF = new GrandFather();
        GF.home();
        GF.car();
        System.out.println("=".repeat(10));

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        g1.home();
        g1.car();
//        g1.extraMoney();
        System.out.println("When Grandson is born GrandFather is present");

        Father f1 = new Son();
        f1.home();
        f1.car();
        f1.extraMoney();
        System.out.println("When son is born Father is present");

        GrandFather g2 = new Father();
        g1.home();
        g1.car();
//        g1.extraMoney();
        System.out.println("When Father is born GrandFather is present");


        //  Son s1 = new GrandFather();
      //  Son s2 = new Father();

    }
}
