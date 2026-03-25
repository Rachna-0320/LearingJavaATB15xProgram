package ex_09_Arrays;

import java.util.Arrays;

public class Lab085_Array_Max_Min {
    public static void main(String[] args) {

        // Finding maximum and second maximum using Arrays.sort()
        int[] a = {30, 64, 89, 100, 45, 1, 73, 0, 399} ;

        Arrays.sort(a);          // This sorts array in ascending order (small → big)
        System.out.println(a[a.length -1]);  // max number
        System.out.println(a[a.length -2]);  // 2nd max number

        // Finding maximum without using inbuilt method
        int[] num = {25, 68, 80, 36, 28, 77, 49, 20};

        int max = num[0];
        for(int i = 1 ; i < num.length ; i++) {
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);

}

}
