package ex_14_OOP_Part5.Abstraction;

public class Lab0129_Interface_Variables {
    public static void main(String[] args) {
        Dutta d = new Dutta();
        d.display();
        Somya s = new Somya();
        s.display();
    }
}

interface Pramod{
    int a = 100;
    String notes = "Java";

    void display();
}

class Dutta implements Pramod{

    int aa = 10;
    @Override
    public void display() {
        System.out.println(a);  // interface variable are directly use.
        System.out.println(this.aa);
    }
}

class Somya implements Pramod{
    @Override
    public void display() {
        System.out.println(notes);
    }
}