package ex_20_Collection_Framework_SET;

import java.util.*;
public class Lab0175_TreeSet {
    public static void main(String[] args) {

        Set<Object> ts = new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("waterMelon");
        ts.add("apple");
        ts.add("Orange");         // duplicate ignored
        System.out.println("TreeSet (Sorted): " + ts);
        System.out.println("=".repeat(10));

        // for-each loop
        for (Object o : ts){
            System.out.println(o);
        }
        System.out.println("=".repeat(10));

        // Iterator
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // Note:  // TreeSet does NOT allow null
        // TreeSet does NOT allow mixed data types
        // TreeSet maintains sorted order
    }
}
