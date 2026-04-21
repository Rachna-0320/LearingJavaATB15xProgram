package ex_19_Collection_Framework_LIST;

import java.util.*;

public class Lab0161_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("1");
        list.add(1);
        list.add(1);
        list.add(20);
        list.add("0");
        list.add(true);

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty: " + list.isEmpty());
        System.out.println("Contains 1: " + list.contains(1));
        System.out.println("Contains '0': " + list.contains("0"));
        System.out.println("Contains 0: " + list.contains(0));
        System.out.println("Index of true: " + list.indexOf(true));
        System.out.println("Last index of 1: " + list.lastIndexOf(1));

        System.out.println("=".repeat(5));

        // Normal for loop
        for (int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }

        System.out.println("=".repeat(5));

        // Enhanced for loop
        for(Object o : list){
            System.out.println(o);
        }

        System.out.println("=".repeat(5));

        //Iterator
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
