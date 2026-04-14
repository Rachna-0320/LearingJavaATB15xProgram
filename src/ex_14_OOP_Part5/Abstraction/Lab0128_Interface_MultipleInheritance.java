package ex_14_OOP_Part5.Abstraction;

public class Lab0128_Interface_MultipleInheritance {
    public static void main(String[] args) {
        son s = new son();
        s.home();
        s.money();
    }
}

interface F1{
    void home();
    void money();
}

interface F2{
   abstract void money();
}

abstract class M1{
    abstract void money();
}

class son extends M1 implements F1,F2{
    @Override
    public void home(){
    }
    @Override
    public void money(){
        System.out.println("Son Method!");
    }
}