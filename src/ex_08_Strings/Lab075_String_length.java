package ex_08_Strings;

import java.util.Scanner;

public class Lab075_String_length {
    public static void main(String[] args) {
//        1st way
        String letter = "ABCDE" ;
        System.out.println(letter.length());

//        2nd way
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println(name.length());

        String name1 = "Uma a" ;
        int count = name1.length() ;
        System.out.println(count);

        String a = "Rachna" ;
        a = a + "Kumari";
        System.out.println(a.length());

        String b = "-negative" ;
         b = "+positive" ;
        System.out.println(b.length());

        System.out.println("positive".length());
    }
}
// length() is a String method
// It returns the number of characters in a string
//• Returns int (number)
//• Counts all characters
//• Includes spaces also