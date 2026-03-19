package ex_08_Strings;

public class Lab076_String_Comparison_equals {
    public static void main(String[] args) {

        String code1 = "Java" ;
        String code2 = " Java" ;
        String code3 = "-Java" ;
        String code4 = "java" ;
        String code5 = "Java" ;

        String code6 = new String("Java");
        String code7 = new String("-Java");
        String code8 = new String("JAVA ");
        String code9 = new String("+Java");
        String code10 = new String("Java ");
        String code11 = new String("Java");

        // == Comparison operator
        System.out.println(code1 == code2);
        System.out.println(code1 == code5);
        System.out.println(code1 == code6);
        System.out.println(code6 == code7);
        System.out.println(code6 == code11);
        System.out.println("Java " == code2);
        System.out.println("Java" == code5);

        boolean b = code1 == code2;
        System.out.println(b);

        System.out.println("=".repeat(10));

        // equal()
        System.out.println(code1.equals(code2));
        System.out.println(code1.equals(code5));
        System.out.println(code1.equals(code4));
        System.out.println(code1.equals(code6));
        System.out.println(code6.equals(code10));
        System.out.println(code3.equals(code7));
        System.out.println(code6.equals(code11));
        System.out.println(code2.equals(code10));

        boolean c = code5.equals(code6);
        System.out.println(c);

        System.out.println("=".repeat(10));

        // equalsIgnoreCase()
        System.out.println(code1.equalsIgnoreCase(code2));
        System.out.println(code1.equalsIgnoreCase(code4));
        System.out.println(code7.equalsIgnoreCase(code9));
        System.out.println(code6.equalsIgnoreCase(code11));
        System.out.println(code3.equalsIgnoreCase(code7));
    }
}
