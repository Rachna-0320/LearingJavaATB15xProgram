package ex_11_OOPs_Part2.OOPs_01_Inheritance;

public class Lab0112_OOPs_Inheritance {

    public static void main(String[] args) {

        Son ravi = new Son();
        System.out.println("Son Gold: " + ravi.gold_f);
        ravi.bhk2();
        ravi.bhk3();

        Father f1 = new Father();
        System.out.println("Father Gold: " + f1.gold_f);
        f1.bhk2();
//        f1.bhk3();
    }
}

    class  Father{
        int gold_f = 1000;

        void bhk2(){
            System.out.println("Father has 2BHK");
        }
    }

    class Son extends Father{
        void bhk3(){
            System.out.println("Son has 3BHK");
        }

    }
