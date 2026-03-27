package ex_09_Arrays;

public class Lab0102_Array_ProblemSolve {
    public static void main(String[] args) {

        int[] num = {46, 78, 32, -2, 89, 1};
        int max2 = Integer.MIN_VALUE;;
        int secondmax = Integer.MIN_VALUE;
        int max3rd = Integer.MIN_VALUE;

        for(int i = 0; i < num.length ; i++){
            if (num[i] > max2){
                max3rd = secondmax;
                secondmax = max2;
                max2 = num[i];

            } else if (num[i] > secondmax && num[i] != max2){
                max3rd = secondmax;
                secondmax = num[i];

            }else if (num[i] > max3rd && num[i] != secondmax && num[i] != max2){
                max3rd = num[i];
            }
        }
        System.out.println("Maximum :" + max2);
        System.out.println("Second Max :" + secondmax);
        System.out.println("Third Max : " + max3rd);

    }
}

