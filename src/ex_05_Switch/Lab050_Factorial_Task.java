package ex_05_Switch;

import java.util.Scanner;

public class Lab050_Factorial_Task {
    public static void main(String[] args) {
//        System.out.println("Welcome to the Factorial Program");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the positive int Number");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
        System.out.println(n);

            int fact = 1;

            for (int i = 1; i <= n; i++) {

                fact = fact * i;

            }
            System.out.println("Factorial is ->" + fact);
        } else {
            System.out.println("Enter valid int");
        }
        scanner.close();
    }
}
