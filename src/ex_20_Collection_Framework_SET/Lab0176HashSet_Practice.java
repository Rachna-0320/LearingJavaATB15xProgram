package ex_20_Collection_Framework_SET;

import java.util.*;

public class Lab0176HashSet_Practice {
    public static void main(String[] args) {

        Set<Object> num = new HashSet<>();
        num.add(64);
        num.add(2);
        num.add(89);
        num.add(43);
        num.add(1);
        num.add(null);
        num.add("HELLO");
        System.out.println(num);

        Iterator iterator = num.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object i: num){
            System.out.println(i);
        }

//        for (int i = 0; i < num.size(); i++){
//            System.out.println(num.get(i));
//        }  // not support
    }
}
