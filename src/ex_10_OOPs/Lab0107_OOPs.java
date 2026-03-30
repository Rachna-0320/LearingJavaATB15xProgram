package ex_10_OOPs;

public class Lab0107_OOPs {
    String name ;

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Somya";
        System.out.println(p1.name);

        Person p2 = new Person();  //Reference variable + object creation + constructor call
        p2.name = "Somya";
//        p1.name = "Somya";    // same reference but different object is created

        Person p3;        // It is pointing to null area
                         // Only declared, not created, No memory allocated, No object created
                        // Reference variable is created, but no object in memory

        new Person() ;  // This creates an object BUT ❗, •No variable to store it,
        // •	So it gets lost (garbage)
    }

}
