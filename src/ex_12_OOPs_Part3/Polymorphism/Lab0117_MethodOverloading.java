package ex_12_OOPs_Part3.Polymorphism;

public class Lab0117_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new  MathOperations();
        int r1 = m1.add(3, 4);
        int r2 = m1.add(3, 4, 8);
        double r3 = m1.add(3.14, 3.65);
        String r4 = m1.add("Method", " Overloading");

        System.out.println("Add (2 int): " + r1);
        System.out.println("Add (3 int): " + r2);
        System.out.println("Add (double): " + r3);
        System.out.println("Add (String): " + r4);
    }
}
class MathOperations{
    int add(int a, int b ){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }

    String add(String a, String b){
        return a + b;
    }
}

