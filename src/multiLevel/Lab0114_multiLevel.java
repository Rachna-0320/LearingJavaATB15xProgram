package multiLevel;

public class Lab0114_multiLevel {
    public static void main(String[] args) {

        Son Uttam = new Son();
        Uttam.home();
        Uttam.car();
        Uttam.extraMoney();
        Uttam.bhk3();

        Father f = new Father();
        f.home();
        f.car();
        f.extraMoney();

        GrandFather GF = new GrandFather();
        GF.home();
        GF.car();

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f1 = new Son();

        // Son s1 = new GrandFather():
      //  Son s2 = new Father():

    }
}
