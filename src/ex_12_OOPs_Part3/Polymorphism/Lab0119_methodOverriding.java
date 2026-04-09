package ex_12_OOPs_Part3.Polymorphism;

public class Lab0119_methodOverriding {
    public static void main(String[] args) {

        Father f = new Father();
        f.home();

        Son s = new Son();
        f.home();
        s.home();

        Father f1 = new Son();
        f1.home();
        f.home();
        s.home();
    }
}

class Father{
    void home(){
        System.out.println("Father House: 2BHK");
    }
}

class Son extends Father{
    @Override
    void home(){
        System.out.println("Son House: 3BHK");
    }
}