package ex_08_Strings;

public class Lab064_String_Immutable {
    public static void main(String[] args) {
//        String name = "Rachna" ;  -> String constant pool
//        name = name + "Kumari";   ->  concatenation (+)
//        System.out.println(name); -> Heap memory

//        String name = "Reena" ;
//        boolean result = name.contains("e") ;
//        System.out.println(result);

        // String are immutable.
          String name = "Nirav";
//          name.toUpperCase();
          name =  name.toUpperCase();
        System.out.println(name);

    }
}
