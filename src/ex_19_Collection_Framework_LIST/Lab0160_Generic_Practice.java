package ex_19_Collection_Framework_LIST;

public class Lab0160_Generic_Practice {
    public static void main(String[] args) {
        temp(4, 6);
        temp("Hello", "JAVA");
        temp(2.4, 5.666);

    }

    static <code> code temp(code a, code b){
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}
