package ex_14_OOP_Part5.Abstraction;

public class Lab0127_Interface_InheritanceType {
    public static void main(String[] args) {
        child c = new child();
        c.home();
    }
}

 // Multiple Inheritance using Interfaces
interface Father1{
    void home();
}

interface Father2{
    void home();
}

class child implements Father1,Father2{
    @Override
    public void home(){
        System.out.println("Child inherits home from both parents");
    }
}