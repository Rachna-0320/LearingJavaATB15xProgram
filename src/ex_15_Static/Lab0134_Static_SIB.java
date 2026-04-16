package ex_15_Static;

public class Lab0134_Static_SIB {
    public static void main(String[] args) {

        A a = new A();

    }
}


class A {
    //SIB - Static initialized Block
    static {
        System.out.println("Called only once when class is loaded");
        System.out.println("You can write a code reading a excel, file, database file");
    }
    {
        System.out.println("IIB");
    }
}
