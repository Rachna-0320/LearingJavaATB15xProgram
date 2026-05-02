package ex_21_Collection_Framework_Queue_Map;

import java.util.*;
public class Lab0180_Map {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();
        // No Guaranteed order!
        marks.put("Rahul", 95);
        marks.put("Bob", 84);
        marks.put("Amit", 84);
        marks.put("Queen", 90);
        marks.put("Charlie", 78);
        marks.put("Charlie", 78);
        System.out.println("Map: " + marks);

        // Accessing
        System.out.println("Bob Marks: " + marks.get("Bob"));
        System.out.println("Rachna (default): " + marks.getOrDefault("Rachna", 0));

        // Update
        marks.put("Bob", 88);  //  Duplicate key replaces value
        System.out.println("Updated Bob Marks: " + marks.get("Bob"));

        // Check
        System.out.println("Contains Queen: " + marks.containsKey("Queen"));
        System.out.println(marks.containsKey("Rachna"));
        System.out.println("Contains Value 88: " + marks.containsValue(88));

        // Size
        System.out.println("Size: " + marks.size());

        // Remove
        marks.remove("Amit");
        System.out.println("After removal: " + marks);
        System.out.println(marks.containsValue(84));

        // Iteration

        System.out.println("=".repeat(10));
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}
