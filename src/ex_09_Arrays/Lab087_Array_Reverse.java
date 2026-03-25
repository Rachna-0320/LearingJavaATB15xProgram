package ex_09_Arrays;

public class Lab087_Array_Reverse {
    public static void main(String[] args) {

        // Reverse array using loop
    int[] numbers = {10, 20, 30, 40, 50, 60, 100};
        for(int i = numbers.length - 1 ; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }
    }
}
