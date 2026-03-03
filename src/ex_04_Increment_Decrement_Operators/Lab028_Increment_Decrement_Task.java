package ex_04_Increment_Decrement_Operators;

import org.w3c.dom.ls.LSOutput;

public class Lab028_Increment_Decrement_Task {
    public static void main(String[] args) {

//        int a = 10;
//        int b = a++ + a++ + a++;
//        System.out.println(a);
//        System.out.println(b);

        int c = 3 ;
        int d = c++ * ++c;
        System.out.println(d);
        System.out.println(c);

        int e = 5;
        int f = e++ + e--;
        System.out.println(f);
        System.out.println(e);



    }

}
