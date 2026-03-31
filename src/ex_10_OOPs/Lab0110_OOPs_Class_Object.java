package ex_10_OOPs;

public class Lab0110_OOPs_Class_Object {
    public static void main(String[] args) {

        Human p1 = new Human();
        p1.age = 12;
        System.out.println("Name:" + p1.name);
        System.out.println("Age:" + p1.age);
    }
}
    class Human {
        String name;
        int age;
    }
        // Java provides default constructor automatically
            // Because:
           //	•	did NOT write any constructor
          //	•	So Java internally creates:

    // User-defined Default Constructor
    class Student{
        Student(){                                    // 	Constructor has no parameters
            System.out.println("I am pursuing MCA");
        }
        public static void main(String[] args) {
            Student s1 = new Student();
        }
    }
//
//    // User-defined Default Constructor (with initialization)
    class Book{
        String name;
        Book(){                                 // No parameters
            name = "Atomic Habits";               // Sets value inside constructor
        }

        public static void main(String[] args) {
            Book b1 = new Book();
            System.out.println(b1.name);
        }
    }
//
//    //Parameterized Constructor
    class Pet{
        String name;
        Pet(String n){
            this.name = n ;
        }
        public static void main(String[] args) {
            Pet dog = new Pet("Tommy");
            Pet cat = new Pet("Lily");
            System.out.println(dog.name);
            System.out.println(cat.name);
        }
    }

