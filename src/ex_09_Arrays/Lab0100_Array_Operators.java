package ex_09_Arrays;

public class Lab0100_Array_Operators {
    public static void main(String[] args) {

        // 1. Sum of array
        int[] numbers = {10, 5, 1} ;
        int sum = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i] ;
        }
        System.out.println("Sum: " + sum);

        //  2. Subtraction of array elements
        int sub = numbers[0];
        for (int i = 1 ; i < numbers.length ; i++) {
            sub = sub - numbers[i];
        }
        System.out.println("Subtraction: " + sub);

        // 3. Division of array elements
        int div = numbers[0];
        for (int i = 1 ; i < numbers.length ; i++) {
            div = div / numbers[i];
        }
        System.out.println("Division: " + div);

        // 4. Multiplication of array elements
        int mul = 1;
        for(int i = 0 ; i < numbers.length ; i++){
            mul = mul * numbers[i];
        }
        System.out.println("Multiplication: " + mul);
    }
}

