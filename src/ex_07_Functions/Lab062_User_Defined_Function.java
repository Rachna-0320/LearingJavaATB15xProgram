package ex_07_Functions;

import java.util.Scanner;

public class Lab062_User_Defined_Function {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter a number a =");
        int a = scanner.nextInt();
        System.out.println("Enter a number b =");
        int b = scanner.nextInt();

       int add = sum_of_two_numbers(a , b) ;
        System.out.println("Sum of the number is +" + add);

    }
static int sum_of_two_numbers(int x, int y) {
        return x + y;
}
}
