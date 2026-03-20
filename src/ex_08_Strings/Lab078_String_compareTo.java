package ex_08_Strings;

public class Lab078_String_compareTo {
    public static void main(String[] args) {

        int s = "CODE".compareTo("Code");
        System.out.println(s);

        System.out.println("cODE".compareTo("Code"));
        System.out.println("abc".compareTo("ABC"));
        System.out.println("ABC".compareTo("abc"));
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo(" abc"));
        System.out.println("+abc".compareTo("abc"));

        String a = "Java";
        String b = "C";
        System.out.println(a.compareTo(b));

        String c = "java" ;
        String d = "Java" ;
        System.out.println(c.compareTo(d));
        System.out.println(c.compareToIgnoreCase(d));



    }
}
