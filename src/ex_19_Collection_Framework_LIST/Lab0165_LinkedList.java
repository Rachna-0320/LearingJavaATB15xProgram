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

        System.out.println("=".repeat(10));

        for (Object o : list){
            System.out.println(o);
        }

        System.out.println("=".repeat(10));

        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=".repeat(10));

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
