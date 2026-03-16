package ex_09_Arrays;

public class Lab072_Array {
    public static void main(String[] args) {
         int a = 10;
         int marks[] = {91, 90, 51, 100, 91, 92, 8900};
         int[] marks2 = {91, 90, 51, 100, 91, 92, 89};


         boolean[] is_married_people = {true, true, false} ;
         String[] names = {"Rachna", "Nirav", "Somdev", "Yadav"};

         float[] values = new float[3];
         values[0] = 3.14f ;
        values[1] = 4.14f ;
        values[2] = 5.14f ;

        for(String name: names) {
            System.out.println(name);
        }
            for(int mark: marks) {
                System.out.println(mark);
            }
        }

    }

