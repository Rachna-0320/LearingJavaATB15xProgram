package ex_19_Collection_Framework_LIST;

import java.util.*;
public class Vector_class {
    public static void main(String[] args) {

                Vector<String> v = new Vector<>();
                v.add("Java");
                v.add("Code");
                v.add("Testing");
                v.add("Code");

                System.out.println("Vector: " + v);
                System.out.println("Size: " + v.size());
                System.out.println("Is Empty: " + v.isEmpty());

                v.remove("Code");
                System.out.println("After Removal: " + v);

                System.out.println("Contains Java: " + v.contains("Java"));
                System.out.println("Contains Code: " + v.contains("Code"));
                System.out.println("Size: " + v.size());

                System.out.println("=".repeat(10));

                // Iterator
                Iterator<String> iterator = v.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

                System.out.println("=".repeat(10));

                // Enumeration
                Enumeration<String> enumeration = v.elements();
                while (enumeration.hasMoreElements()) {
                    System.out.println(enumeration.nextElement());
                }
            }
        }

