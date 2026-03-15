package ex_08_Strings;

public class Lab069_String_CharSequence {
    public static void main(String[] args) {
        CharSequence s = "Rachna" ;
        System.out.println(s);
        System.out.println(s.subSequence(2,6));

        String s1 = "Unhappy".substring(2);
        System.out.println(s1);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        String s2 = "ab".repeat(5);
        System.out.println(s2);

        System.out.println( "=".repeat(15));
        System.out.println("Here we got !!");
        System.out.println( "=".repeat(15));


        long count = "a \n b \n c".lines().count();
        System.out.println(count);
    }
}
