package ex_08_Strings;

import java.sql.SQLOutput;

public class Lab066_Strings_Function {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s = "ABCD";
        System.out.println(s);
        System.out.println(s.length());// length start counting from 1.
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat("E"));
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("b"));

    }
}
