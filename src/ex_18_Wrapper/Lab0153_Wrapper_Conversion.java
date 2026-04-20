package ex_18_Wrapper;


public class Lab0153_Wrapper_Conversion {
    public static void main(String[] args) {

        Integer a = 10;     // Integer is wrapper final class which have lots of methods
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        String num = "101";
        int aa = 10;

        // String -> Wrapper Conversion
        Integer b = Integer.parseInt(num);
        System.out.println(b);
       // Double.parseDouble();
       // Float.parseFloat();
        //Long.parseLong();

       // String to Primitive
        int c = Integer.parseInt(num);
        System.out.println(c);

        Integer d = Integer.valueOf("101");
        System.out.println(d);
    }
}
