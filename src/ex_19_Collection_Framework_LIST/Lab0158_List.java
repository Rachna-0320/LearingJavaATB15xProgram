package ex_19_Collection_Framework_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab0158_List {
    public static void main(String[] args) {

        List fruits = List.of("Apple, Banana, Watermelon, Papaya, Grapes, Orange");
        System.out.println(fruits);

       //  List list = new List();   // not create object of list
        ArrayList list1 = new ArrayList();

        List list = new ArrayList();
        list.add("JAVA");
        list.add(123);
       list.add(true);
        System.out.println(list);

        List list2 = new ArrayList(1);
        list2.add(true);
        list2.add("99");
        list2.add("Apple");
        list2.add(1);
        System.out.println(list2);
    }
}

// * List is an interface
// * "List" it is present in import java.util.List package
// * List have many in-built methods -> "of" method which is static method in the list interface
// (interface can have static and default method) These are the pre-define method available in list

// ** List object can not create because list is an interface