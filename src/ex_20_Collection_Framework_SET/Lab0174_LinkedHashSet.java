package ex_20_Collection_Framework_SET;

import java.util.*;

public class Lab0174_LinkedHashSet {
    public static void main(String[] args) {

        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("waterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("=".repeat(10));

        for (Object o : lhs){
            System.out.println(o);
        }

//        for(int i = 0 ; i < lhs.size() ; i++) {
//            System.out.println(lhs.get(i));
//        }

        System.out.println("=".repeat(10));

        Iterator it = lhs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
