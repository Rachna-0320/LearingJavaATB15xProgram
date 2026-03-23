package ex_09_Arrays;

import java.util.Scanner;

public class Lab096_Array_Scanner_Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = scanner.nextInt();

        int[] b = new int[a];
        for(int i = 0 ; i < b.length ; i++) {
            System.out.println("Enter the marks");
            b[i] = scanner.nextInt();
        }

        for(int i = 0 ; i < b.length ; i++){
             System.out.println(b[i]);
}
       }
}
