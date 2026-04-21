package ex_19_Collection_Framework_LIST;

public class Lab0159_Generic {
    public static void main(String[] args) {

        temp(5, 3);
        temp("Java ","Code");
    }

//    static void temp(Integer a, Integer b){
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    static void temp(String a, String b){
//        System.out.println(a);
//        System.out.println(b);
//    }

    static <T> T temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
