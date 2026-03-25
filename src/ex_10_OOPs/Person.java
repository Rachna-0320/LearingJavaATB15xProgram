package ex_10_OOPs;

public class Person {
    String name ;

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Somya";

        Person p2 = new Person();
        p2.name = "Somya";

        Person p3;      //Only declared, not created, No memory allocated, No object created


        new Person() ;  // This creates an object BUT ❗, •No variable to store it,
        // •	So it gets lost (garbage)
    }

}
