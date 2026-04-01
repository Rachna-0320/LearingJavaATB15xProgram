package ex_10_OOPs;

public class Lab0109_OOPs_Practices {
        public static void main(String[] args) {

            Car t = new Car();
            System.out.println(t.name + t.model + t.year);

            Car t2 = new Car("Tesla");
            System.out.println(t2.name);

            Car t3 = new Car("Tata", "Punch");
            System.out.println(t3.name);
            System.out.println(t3.model);
            System.out.println(t3.year);
        }
    }
            // Constructor Overloaded
    class Car {
        String name;
        int year;
        String model;

        Car() {
            name = "Hyundai";
            year = 2015;
            model = "Venue";
        }

        Car(String nameGiven){
            this.name = nameGiven;
        }

        Car(String nameGiven, String modelGiven){
            this.name = nameGiven;
            this.model = modelGiven;
            this.year = 2024;
        }
    }


