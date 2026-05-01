package ex_21_Collection_Framework_Queue_Map;

import java.util.*;

public class Lab0183_HashTable {
    public static void main(String[] args) {

        // HashMap -> allows one null key and multiple null values
        // Hashtable -> does NOT allow null key or null value
        // Hashtable is synchronized (thread-safe) but slower and considered legacy

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
//        ht.put(4, null);
//        ht.put(null, "three");
        System.out.println("Hashtable: " + ht);

        // Access
        System.out.println("Value for key 2: " + ht.get(2));

        // Check
        System.out.println("Contains key 1: " + ht.containsKey(1));

        // Size
        System.out.println("Size: " + ht.size());
    }
}
