package ex_04_Increment_Decrement_Operators;

public class Lab026_Increment_Operator2 {
    public static void main(String[] args) {

        int a = 10;
//        System.out.println(a++ + a);
//        A -> a++ -> A=10, a=11
//        +
//        B -> a -> 11
//        A + B
//        10 + 11

//        System.out.println(++a + a);

//        System.out.println(a++ + ++a);
//        A -> a++ -> A=10, a=11
//        +
//        B -> ++a -> 12
//        A + B
//        10 + 12
//
//        System.out.println(a);

        System.out.println(++a + ++a);
        System.out.println(a);
    }
}
