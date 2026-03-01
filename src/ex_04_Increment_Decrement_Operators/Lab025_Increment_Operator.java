package ex_04_Increment_Decrement_Operators;

public class Lab025_Increment_Operator {
    public static void main(String[] args) {


        byte pre = 10;
        System.out.println(++pre);
        System.out.println(++pre);
        System.out.println(pre);
//
        byte post = 10;
        System.out.println(post++);
        System.out.println(post++);
        System.out.println(post);

        int a = 20;
        int b = ++a;              //   ++a -> a = a+1
        System.out.println(a);
        System.out.println(b);

//           Expression and Result Table ( ERT)
//      || Line no |   a     | Result (b) ||
//      ||  6      |   20    | NA
//      ||  7      |   21    | 21
//      ||  8      |   21
 //      ||  9      |   11    | 11  - print
////
//        System.out.println(++a);
////
//        int c = 10;
//        int d = c++;
//        System.out.println(c);
//        System.out.println(d);

//        Expression and Result Table ( ERT)
//      || Line no |   c     | Result (d) ||
//      ||  20     |   10    | NA
//      ||  21     |   11    | NA
//      ||  22     |   11
//      ||  23     |   11    | 10  - print

        int s = 10;
        System.out.println(s + s++);
        System.out.println(s);

        int s1 = 10;
        System.out.println(s1++ + s1);
        System.out.println(s1);

    }
}
