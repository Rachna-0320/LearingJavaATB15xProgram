package ex_14_OOP_Part5.Abstraction;

public class Lab0125_Abstraction_class {
    public static void main(String[] args) {
         Alto car = new Alto();
         car.drive();
    }
}

abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}


 class Alto extends Car1{
    void drive(){
        startCar();
        System.out.println("We are driving a car");
        stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Starting Alto car");
    }

        @Override
        void stopCar() {
            System.out.println("Stopping Alto car");
        }
 }