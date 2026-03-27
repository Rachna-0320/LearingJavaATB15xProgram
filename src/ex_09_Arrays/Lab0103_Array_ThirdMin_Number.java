package ex_09_Arrays;

public class Lab0103_Array_ThirdMin_Number {
    public static void main(String[] args) {

        int[] num = {56, 0, -9, 67, 1, -1, 4, 45, 100};
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for(int i = 0 ; i < num.length ; i++){

            if (num[i] < min){
                min3 = min2;
                min2 = min;
                min = num[i];

            } else if (num[i] < min2 && num[i] != min){
                min3 = min2;
                min2 = num[i];

            } else if(num[i] < min3 && num[i] != min2 && num[i] != min){
                min3 = num[i];
            }
        }
        System.out.println("Min :" + min);
        System.out.println("Min2 :" + min2);
        System.out.println("Min3 :" + min3);
    }
}
