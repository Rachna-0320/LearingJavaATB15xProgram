package ex_19_Collection_Framework_LIST;

import java.util.*;

public class Lab0166_ArrayList2 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Program");
        myList.add("Code");
        System.out.println(myList);
        System.out.println("=".repeat(10));

        for(String programming : myList){
            System.out.println(programming);
        }
        System.out.println("=".repeat(10));

        for(int i = 0 ; i < myList.size() ; i++){
            System.out.println(myList.get(i));
        }
        System.out.println("=".repeat(10));

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
