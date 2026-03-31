package ex_10_OOPs;

    class Student {
        // Default Constructor
        Student() {
            System.out.println("I am pursuing MCA");
        }
    }

    class Book {
        String name;

        // Default Constructor with initialization
        Book() {
            name = "Atomic Habits";
        }
    }

    class Pet {
        String name;

        // Parameterized Constructor
        Pet(String n) {
            this.name = n;
        }
    }
public class Lab0110_OOPs_Class_Object {
    public static void main(String[] args) {
        Student s1 = new Student();

        Book b1 = new Book();
        System.out.println(b1.name);

        Pet dog = new Pet("Tommy");
        Pet cat = new Pet("Lily");

        System.out.println(dog.name);
        System.out.println(cat.name);
    }

}



