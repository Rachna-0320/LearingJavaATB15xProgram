package ex_21_Collection_Framework_Queue_Map;

import java.util.*;

public class Lab0182_HashMap_Practice {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);

        System.out.println(map);

        for(Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
