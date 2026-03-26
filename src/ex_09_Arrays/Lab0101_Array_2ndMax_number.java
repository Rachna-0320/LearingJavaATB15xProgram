package ex_09_Arrays;

public class Lab0101_Array_2ndMax_number {
    public static void main(String[] args) {

        int[] num = {38, 10, 95, 8, 1, 45, 50};
        int max = num[0];
        int secondMax = num[0];

        for(int i = 1 ; i < num.length ; i++) {
            if(num[i] > max){
                secondMax = max;
                max = num[i];
            } else if(num[i] >  secondMax && num[i] != max ){
                secondMax = num[i];
            }
        }
        System.out.println( secondMax);
        System.out.println(max);
    }
}
