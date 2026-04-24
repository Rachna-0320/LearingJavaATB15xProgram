package ex_19_Collection_Framework_LIST;

import java.util.*;

public class Lab0167_LinkedList_Practice {
    public static void main(String[] args) {

        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.addFirst("Mango");
        fruits.addLast("Orange");
        System.out.println(fruits);
        System.out.println("=".repeat(5));

        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());
        System.out.println("=".repeat(5));

        System.out.println(fruits.get(2));
        System.out.println("=".repeat(5));

        System.out.println(fruits.removeFirst());
        System.out.println("=".repeat(5));

        System.out.println(fruits.remove("Apple"));
        System.out.println("=".repeat(5));

        System.out.println(fruits);
        System.out.println("=".repeat(5));

        System.out.println(fruits.size());

       fruits.remove(2); // LinkedList support index-based methods, but it does not use index-based storage
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.isEmpty());

        System.out.println(fruits);

    }
}

//Requirement where we want to modify the collection many times, then we always use the LinkedList.
