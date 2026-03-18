package ex_09_Arrays;

public class Lab074_Array_Example {
    public static void main(String[] args) {

        String[] fruits = new String[3] ;
        fruits[0] = "Apple" ;
        fruits[1] = "Mango" ;
        fruits[2] = "Papaya" ;
        System.out.println( fruits[0]);
        System.out.println( fruits[2]);
        System.out.println( fruits[1]);

        System.out.println("=".repeat(10));

        int[] marks = {51, 100, 93, 56, 33};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

//        System.out.println("=".repeat(10));
//
//        for(int mark:marks) {
//            System.out.println(mark);
//        }
//
//        System.out.println("=".repeat(5));

   for(int i = 0 ; i < marks.length ; i++){
       System.out.println(marks[i]);
        }
    }
}
