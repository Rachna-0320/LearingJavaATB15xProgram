package ex_09_Arrays;

public class Lab094_3dArray {
    public static void main(String[] args) {
        int[][][] arr_3D = {
                {
                        {1, 2, 3,},
                        {4, 5, 6}
                } ,
                {
                        {7, 8, 9},
                        {10, 12, 12}
                }
        };
        System.out.println("Element at arr[1][0][2]:" + arr_3D[1][0][2]);

    }
}
