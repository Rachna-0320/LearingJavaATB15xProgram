package ex_19_Collection_Framework_LIST;

import java.util.*;

public class Lab0172_ArrayList_reverseOrder {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(6);
        num.add(3);
        num.add(0);

        System.out.println("Original List: " + num);

        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + num);

        Collections.reverse(num);
        System.out.println("Reversed List: " + num);

        System.out.println("=".repeat(10));

        for(Integer o: num){
            System.out.println(o);
        }
    }
}
