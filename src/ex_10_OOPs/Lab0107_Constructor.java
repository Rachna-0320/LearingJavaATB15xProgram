package ex_10_OOPs;

public class Lab0107_Constructor {
    public static void main(String[] args) {

        Animal dog = new Animal();
        A a = new A();
        MYSQL b = new MYSQL();
    }
}

class A{
    A(){
        System.out.println("Another way to write -> Default Constructor");
    }
}

class MYSQL {
    MYSQL(){
        System.out.println("MYSQL Connected!");
    }
}