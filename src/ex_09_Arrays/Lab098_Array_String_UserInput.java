package ex_09_Arrays;

import java.util.Scanner;

public class Lab098_Array_String_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scanner.nextInt();

        String[] name = new String[size];
        for (int i = 0 ; i < name.length ; i++) {
            System.out.println("Enter Names");
            name[i] = scanner.next();
        }
        System.out.println("=".repeat(5));

       for (int i = 0 ; i < name.length ; i++) {
           System.out.println(name[i]);
       }

    }
}
