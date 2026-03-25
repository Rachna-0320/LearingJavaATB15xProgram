package ex_09_Arrays;

public class Lab088_Sum_of_Array {
    public static void main(String[] args) {

        int[] numbers = {60, 30, 10} ;
        int sum = 0 ;
        for(int value : numbers){
            sum = sum + value;
        }
        System.out.println("Sum: " + sum);

        int mul = 1;
        for (int value : numbers) {
            mul = mul * value;
        }
        System.out.println(mul);


    }
}
