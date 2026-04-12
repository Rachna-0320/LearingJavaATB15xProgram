package ex_14_OOP_Part5.Abstraction;

import java.sql.SQLOutput;

public class Lab0124_Abstraction {
    public static void main(String[] args) {
        Son s = new Son ();
        s.loan50k();
        s.loan10k();
    }
}

abstract class Father{
    abstract void loan50k();

    // concrete - means complete method
    void loan10k(){
        System.out.println("Given!");
    }
}

class Son extends Father{
    @Override
    void loan50k() {
        System.out.println("Given by Son!");

    }
}