package ex_09_Arrays;

public class Lab093_2nd_Highest_Array {
    public static void main(String[] args) {

//        int[] numbers = {12, 56, 89, 53, 89, 46, 52} ;
//        int highest = 0 ;
//        int secondHighest = 0;
//
//        for(int num : numbers) {
//            if (num > highest) {
//                secondHighest = highest;
//                highest = num;
//            }
//        }
//        System.out.println(secondHighest);

        int[] numbers = {12, 56, 89, 53, 89, 46, 52} ;
        int highest = 0 ;
        int secondHighest = 0;

        for(int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }
}
