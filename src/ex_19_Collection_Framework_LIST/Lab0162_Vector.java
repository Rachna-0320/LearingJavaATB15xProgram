package ex_19_Collection_Framework_LIST;

import java.util.*;

public class Lab0162_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Java");
        v.add("Code");
        v.add(2);
        v.add("Code");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Code");
        System.out.println(v);
        System.out.println(v.contains("Java"));
        System.out.println(v.contains("Code"));
        System.out.println(v.size());

        System.out.println("=".repeat(10));

         //Iterator
        Iterator iterator =  v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=".repeat(10));

        // Enumerator
        Enumeration enumeration = v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
