package ex_08_Strings;

import java.sql.SQLOutput;

public class Lab066_Strings_Function {
    public static void main(String[] args) {

//      Lab066_Strings_Function o = new Lab066_Strings_Function();
//        System.out.println(o);

//        char c = 'A';
//        System.out.println(c);
//
//        String s1 = "ABCD";
//        int l = s1.length() ;
//        System.out.println(l);



        String s = "ABCD";
        System.out.println(s);
        System.out.println(s.length());  // length start counting from 1.

        System.out.println("=".repeat(10));

        System.out.println(s.toLowerCase());
        System.out.println(s.contains("c"));
        System.out.println(s.contains("C"));

        System.out.println("=".repeat(10));

        System.out.println(s.toUpperCase()); // no new string create in SCP because "AB CD "
//                                               already exist.
        System.out.println(s.concat("E"));

        System.out.println(s.length());
        System.out.println(s.contains("E"));
        System.out.println(s.contains("e"));

    }
}
