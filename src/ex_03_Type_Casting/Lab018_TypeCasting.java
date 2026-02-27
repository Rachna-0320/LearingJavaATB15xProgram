package ex_03_Type_Casting;

public class Lab018_TypeCasting {
    public static void main(String[] args) {

        byte a = 26;
        int b = a;
        System.out.println(b);    // valid, This is Implicit - widening type casting
        int a1 = (int)b;
        System.out.println(a1);   // valid,  this is Explicit - widening type casting

        int c = 50000;
//        byte c1 = c;           // not valid, this is Implicit - Narrowing type casting
        byte d = (byte)c;
        System.out.println(d);    // this is Explicit - Narrowing type casting
        short e = (short)c;
        System.out.println(e);
        long f = (long)c;
        System.out.println(c);

        char g = 'A';
        int h = g;
        System.out.println(h);     // output = 65

        int g1 = 66;
        char g2 = (char)g1;
        System.out.println(g2);     // output = B
    }
}
