package ex_08_Strings;

public class Lab067_String_Examples {
    public static void main(String[] args) {
        String s = "Hello" ;
//        String s1 = "Hello" ;
//        String s2= "Hello" ;
        String s3= "hello" ;
        s3 = s3.toUpperCase();
//        2 String objects created in SCP

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Hello");
        String s7 = new String("hello");
        // 4 String objects created in Heap area

//        == Comparison -> String reference is check

//        System.out.println(s == s2);
//        System.out.println(s1 == s4);
        System.out.println(s == s3);
//        System.out.println(s6 == s7);
//        System.out.println(s3 == s7);
//
////        equal (content) -> value
//        System.out.println(s.equals(s4));
//        System.out.println(s.equals(s3));
//        System.out.println(s3.equals(s7));
//        System.out.println(s4.equals(s7));
//
//        System.out.println(s4.equalsIgnoreCase(s7));   // both convert into LowerCase
//        System.out.println(s.equalsIgnoreCase(s7));

//        equalsIgnoreCase -> rachna, Rachna, RACHNA, RacHNA, RachnA, -> rachna
//        == -> check for the reference
//         equal operator assignment the value




//        String s1 = "Hello";
//        String s2 = s1;
//        s1 = "World";
//        System.out.println(s2);

    }
}
