package ex_19_Collection_Framework_LIST;


import java.util.*;
public class Lab0163_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Mango");
        moreFruits.add("Cherry");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Onion");
        vegetables.add("Potato");

        // Nested List
        List<List<String>> allItems = new ArrayList<>();
        allItems.add(fruits);
        allItems.add(moreFruits);
        allItems.add(vegetables);

        System.out.println("Nested List: " +  allItems);
        System.out.println( "Size: " + allItems.size());
        System.out.println("Second List: " + allItems.get(1));

        for (List<String> list : allItems) {
            System.out.println(list);
        }
    }
}
