package ex_08_Strings;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Lab068_String_Practice {
    public static void main(String[] args) {
//        String s = "Java" ;
//        char c = s.charAt(3) ;
//        System.out.println(c) ;


        // Comparison based on the Unicode value of each character in String
        int result = "abc".compareTo("ABC");  // Here -> 97 - 65 => 32 result is positive
        int result1 = "ABC".compareTo("ABC");     // result is zero if the string are equal.
        int result2 = "ABC".compareTo("abc"); // Here -> 65 - 97 => -32 result is negative
        int result3 = "abc".compareTo("ABCDDDDFFGG");
        int result4 = "ABCabc".compareTo("ABCDDDDFFGG");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        int idx = "Java".indexOf("a");
        System.out.println(idx);
        int idx1 = "Java".indexOf("A");
        System.out.println(idx1);
        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

          boolean b = "".isEmpty();
          System.out.println(b);

        boolean b1 = " ".isBlank();
        System.out.println(b1);


        String s1 = String.join("*","Hello" , "Java" ,"Programming") ;
        System.out.println(s1);

        String s2 = "Java".replace('a' , 'o');
        System.out.println(s2);


    }





}
