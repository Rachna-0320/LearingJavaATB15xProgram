package ex_09_Arrays;

public class Lab0105_2D_Array_Element_Sum {
    public static void main(String[] args) {

        int[][] num = {
                {45, 25, 01},
                {50, 20, 02}
        };

        int sum = 0;
        for(int i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num[i].length ; j++){
                sum = sum + num[i][j];
            }
        }
        System.out.println(sum);
    }
}
