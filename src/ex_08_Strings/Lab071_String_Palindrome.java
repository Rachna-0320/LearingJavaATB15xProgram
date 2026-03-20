package ex_08_Strings;

import java.util.Scanner;

public class Lab071_String_Palindrome {
    public static void main(String[] args) {

         // Reverse the string using loop
        //  Palindrome -> madam reverse madam

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the String");
        String user_input = scanner.nextLine();

        String reversedString = "" ;

        for (int i = user_input.length() -1 ; i >= 0 ; i--) {
            reversedString = reversedString + user_input.charAt(i);
        }
    if (reversedString.equalsIgnoreCase(user_input)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome!");
    }
        scanner.close();
    }
}
