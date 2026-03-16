package ex_09_Arrays;

import java.util.Arrays;

public class Lab075_Array_Max_Min {
    public static void main(String[] args) {

        int[] a = {30, 64, 89, 100, 45, 1, 73, 0, 399} ;
       Arrays.sort(a);
        System.out.println(a[a.length -1]);  // max number

        Arrays.sort(a);
        System.out.println(a[a.length -2]);  // 2nd max number


//        int max = a[0] ;
//        for (int i = 0; i < a.length; i++) {
//            if(a[i] > max) {
//                max = a[i] ;
//            }
//        }
//        System.out.println(max);
    }
}
