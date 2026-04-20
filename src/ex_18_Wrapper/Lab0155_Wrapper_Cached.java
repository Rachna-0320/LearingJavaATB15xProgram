package ex_18_Wrapper;

public class Lab0155_Wrapper_Cached {
    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);    // true (Cached)


        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);        // false (not Cached)
        System.out.println(c.equals(d));

    }
}
