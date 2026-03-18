package ex_08_Strings;

public class Lab065_String_new_object {
    public static void main(String[] args) {
        String s1 = "Rachna" ;
        String s2 = new String("Rachna");
        System.out.println(s1);
        System.out.println(s2);

   String a = "Hello" ;
   a = a.concat("World") ;
        System.out.println(a);

//        String Pool                    Heap
//         -----------                --------
//          "Hello"
//          "World"                   "HelloWorld"
//
//          a ─────────────► "HelloWorld"

//        String literal → String Pool
//        String created by methods (concat, + at runtime) → Heap


        String a1 = "Hello" ;
        a1 = a1.concat("World") ;
        a1 = a1 + "Rachna" ;
        String b = a1 + "Kumari" ;
        System.out.println(b);
    }
}
