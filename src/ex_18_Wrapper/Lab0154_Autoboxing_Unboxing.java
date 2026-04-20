package ex_18_Wrapper;

public class Lab0154_Autoboxing_Unboxing {
    public static void main(String[] args) {

        int a =10;
        Integer b = a;         // Boxing - Primitive data type is converted wrapper - Automatic JVM will do it
        // because if we convert smaller to bigger there is no problem
        System.out.println(b);   // here b have attributes and methods

        Integer c = 20;
        int d = c;          // Unboxing
        System.out.println(d);      // here d lost attributes and methods



    }
}
