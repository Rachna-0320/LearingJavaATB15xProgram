package ex_21_Collection_Framework_Queue_Map;

import java.util.*;

public class Lab0181_HashMap {
    public static void main(String[] args) {

        // HashMap - No order
        Map<String, Object> mp = new HashMap<>();
        mp.put("name", "Rachna");
        mp.put("rollNo", 1);
        mp.put("phone", 123456789);
        System.out.println("HashMap: " + mp);


        // LinkedHashMap - Maintains insertion order
        Map<String, Object> mp1 = new LinkedHashMap<>();
        mp1.put("name", "Riya");
        mp1.put("rollNo", 20);
        mp1.put("phone ", 123456789);
        System.out.println("LinkedHashMap: " + mp1);

        // TreeMap - Sorted by keys
        Map<String, Object> mp2 = new TreeMap<>();
        mp2.put("name", "Rachna");
        mp2.put("rollNo", 1);
        mp2.put("phone ", 123456789);
        System.out.println("TreeMap: " + mp2);
    }
}
