package ex_11_OOPs_Part2.OOPs_01_Inheritance;

public class Lab0116_Method_Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animal b = new Dog();
        b.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }
