package ex_14_OOP_Part5.Abstraction;

public class Lab0126_Interface {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.drive();
    }
}

class Car2 implements Brake,Engine1{

    @Override
    public void applyBrake() {
        System.out.println("Applying Brake");
    }
    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }
    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine");
    }
        void drive() {
            startEngine();
            applyBrake();
            testEngine();
            Engine1.testEngineStatic();
            stopEngine();
        }
    }

interface  Brake{
    void applyBrake();
//   void applyBrake2(){ }     // not allow complete method in interface
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("concrete Default");
    }

    static void testEngineStatic(){
        System.out.println("concrete Static");
    }
}