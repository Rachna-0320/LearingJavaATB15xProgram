package ex_11_OOPs_Part2.OOPs_01_Inheritance;

public class Lab0118_Type_of_Inheritance {
    public static void main(String[] args) {

        Bird b = new Bird();
        b.fly();
        System.out.println("=".repeat(30));

        Parrot p = new Parrot();
        p.fly();
        p.eat();
        System.out.println("=".repeat(30));

        ParrotBaby pb = new  ParrotBaby();
        pb.fly();
        pb.eat();
        pb.sound();
        System.out.println("=".repeat(30));

        Ostrich o = new Ostrich();
        o.fly();
        o.height();
        System.out.println("=".repeat(30));

        Peacock pk = new Peacock();
        pk.fly();
        pk.dance();
    }
}

class Bird{
    void fly(){
        System.out.println("Some birds can fly");
    }
}
class Parrot extends Bird{
    void eat(){
        System.out.println("Parrot Loves to eat Jujube");
    }
}
class ParrotBaby extends Parrot{
    void sound(){
        System.out.println("Sound: chip-chip");
    }
}

class Ostrich extends Bird{
    @Override
    void fly(){
        System.out.println("Ostrich cannot fly");
    }
    void height(){
        System.out.println("Ostrich is largest Bird");
    }
}
class Peacock extends Bird {
    void dance() {
        System.out.println("Peacock can Dance");
    }
}