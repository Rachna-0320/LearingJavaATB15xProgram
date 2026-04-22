package ex_19_Collection_Framework_LIST;

import java.util.*;

public class Lab0164_ArrayList_Practice {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(72);
        marks.add(83);
        marks.add(90);
        marks.add(69);
        marks.add(100);
        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);


    }
}
