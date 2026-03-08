package ex_04_Increment_Decrement_Operators;

import org.w3c.dom.ls.LSOutput;

public class Lab028_Increment_Decrement_Task {
    public static void main(String[] args) {

        int a = 10;
        int b = a++ + a++ + a++;
        System.out.println(a);       // output = 13
        System.out.println(b);       // output = 33

        int c = 3 ;
        int d = c++ * ++c;
        System.out.println(d);      // output = 15
        System.out.println(c);      // output = 5

        int e = 5;
        int f = e++ + e--;
        System.out.println(f);      // output = 11
        System.out.println(e);      // output = 5


    }

}
