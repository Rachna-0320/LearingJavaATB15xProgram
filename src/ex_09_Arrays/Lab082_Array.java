package ex_09_Arrays;

public class Lab082_Array {
    public static void main(String[] args) {
         int a = 10;
         int marks[] = {+91, 90, 51, -100, 91, 92, 8900};
         int[] marks2 = {91, 90, 51, 100, 91, 92, 89};

//        System.out.println(marks[3]);

         boolean[] is_married_people = {true, true, false} ;
        System.out.println(is_married_people[2]);

         String[] names = {"Rachna", "Nirav", "Somdev", "Yadav"};
        for(String name: names) {                 // Using for-each loop
            System.out.println(name);             //  No index needed
        }
 //  For each element in names array → store it in variable "name"
//   name is a temporary variable
//   It stores one value at a time from array
//
//
//
//
//         float[] values = new float[3];
//         values[0] = 3.14f ;
//        values[1] = 4.14f ;
//        values[2] = 5.14f ;
//        System.out.println(values[1]);

//            for(int mark: marks) {
//                System.out.println(mark);
//            }
        }

    }

