package ex_19_Collection_Framework_LIST;

import java.util.*;

public class Lab0165_LinkedList {
    public static void main(String[] args) {
        List list1 = new ArrayList();         // List list1 = new ArrayList(5);   // ALLOW
        List list = new LinkedList();       //  List list = new LinkedList(5);   // NOT ALLOW

        list1.add(2);
        list.add(4);
        list.add("6");
        list1.add("Hello");
        list.add(8);
        list.add("Hello");

        System.out.println(list1);
        System.out.println(list);

    }
}
