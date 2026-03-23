package ex_09_Arrays;

import java.util.Scanner;

public class Lab086_Array_User_Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the size of tha array");
        int size = scanner.nextInt();

        int[] numbersMarks = new int[size];

        for(int i = 0 ; i < numbersMarks.length ; i++ ) {
            System.out.println("Enter marks for subject " + (i + 1));
            numbersMarks[i] = scanner.nextInt() ;
        }
        System.out.println("=".repeat(10));

        for (int i = 0 ; i < numbersMarks.length ; i++) {
            System.out.println(numbersMarks[i]);
        }
        scanner.close();
    }

}
