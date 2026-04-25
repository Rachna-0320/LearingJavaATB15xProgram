package ex_20_Collection_Framework_SET;

import java.util.*;
public class HashSet_Program {
    public static void main(String[] args) {

        Set<Integer> num = new HashSet<>();
        num.add(64);
        num.add(2);
        num.add(89);
        num.add(43);
        num.add(1);
        num.add(64); // duplicate (ignored)
        System.out.println("Set: " + num);

        System.out.println("=".repeat(10));

        // Iterator
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
                }

        System.out.println("=".repeat(10));

        // Enhanced for loop
        for (Integer i : num) {
            System.out.println(i);
        }
        // Note: Set does not support indexing (no get method)
            }
        }

