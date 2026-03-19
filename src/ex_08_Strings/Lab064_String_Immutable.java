package ex_08_Strings;

public class Lab064_String_Immutable {
    public static void main(String[] args) {
        String name = "Rachna" ;     // -> String constant pool
        name = name + "Kumari";       // ->  concatenation (+)
        System.out.println(name);    // -> Heap memory

//        "Rachna"        (old object, still exists)        String Pool:
//        "Kumari"          (literal in pool)               "Rachna"
//                                                          "Kumari"
//      "RachnaKumari"      (new object)
//                                                            Heap:
//                                                        "RachnaKumari"
//
//                                                      name ───► "RachnaKumari"

        String name1 = "Reena" ;
       name1 = name1.toUpperCase();
        boolean result = name1.contains("e") ;
        System.out.println(result);

//         String are immutable.
//          String child = "Nirav";
//         child.toUpperCase();           // here new String is create "NIRAV" but it
//            did not store it anywhere, so child still refer to "Nirav"

//          child =  child.toUpperCase();  //String methods like toUpperCase() do not
//                                        //modify the original string; they return a new string.
//        System.out.println(child);

    }
}
