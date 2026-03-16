package ex_08_Strings;

import java.util.Scanner;

public class Lab071_String_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the String");
        String s = scanner.next();

        String reversed_string = "" ;

        for (int i =s.length() -1 ; i >= 0 ; i--) {
            reversed_string = reversed_string + s.charAt(i);
        }
    if (reversed_string.equalsIgnoreCase(s)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome !");
    }
    }
}
