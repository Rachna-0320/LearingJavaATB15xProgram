package ex_19_Collection_Framework_LIST;

import java.util.Arrays;
import java.util.List;

public class Lab0171_Convert_Array_To_ArrayList {
    public static void main(String[] args) {

        String arr[] = {"Java", "Python", "C++"};
        List<String> list = Arrays.asList(arr);  // Arrays is a class
        System.out.println(list);
    }
}
// It converts an array into a fixed-size List and prints it.