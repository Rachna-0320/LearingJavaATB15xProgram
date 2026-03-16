package ex_09_Arrays;

public class Lab078_Sum_of_Array {
    public static void main(String[] args) {

        int[] numbers = {10, 56, 82} ;
        int sum = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum+numbers[i] ;
        }
        System.out.println(sum);
    }
}
