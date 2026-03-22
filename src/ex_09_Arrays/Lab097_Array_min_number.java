package ex_09_Arrays;

import java.util.Arrays;

public class Lab097_Array_min_number {
    public static void main(String[] args) {

        // 1. Finding minimum using Arrays.sort()
        int[] num1 = {39, 67, 48, 29, 97, 12, 87, 53, 48};
        Arrays.sort(num1);
        System.out.println("Min (sort): " + num1[0]);

        // 2. Finding minimum without using inbuilt method
        int[] num = {36, 67, 68, 29, 97, 12, 47, 53, 40};
        int min1 = num[0];

        for (int i = 1 ; i < num.length ; i++){
            if (num[i] < min1) {
                min1 = num[i];
            }
        }
        System.out.println("Min (loop): " + min1) ;

        // 3. Finding second minimum using loop logic
        int[] number = {35, 72, 1, 75, 0, 3, 55, 66} ;
        int min =  Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for (int i = 0 ; i < number.length ; i++){
            if (number[i] < min) {
                secondmin = min;
                min = number[i];
            } else if (number[i] < secondmin && number[i] != min) {
                secondmin = number[i];
            }
        }
        System.out.println("Second Min: " + secondmin);
    }
}
