package ex_09_Arrays;

public class Lab0104_2D_Array_Practice {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2}, {3, 4}};
        int[][] c = {{1}, {2}, {3}};

        // a matrix
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j] + " | ");
            }
            System.out.println();
        }

        // b matrix
        for(int i = 0 ; i < b.length ; i++){
            for(int j = 0 ; j < b[i].length ; j++){
                System.out.print(b[i][j] + " | ");
            }
            System.out.println();
        }

        // c matrix
        for(int i = 0 ; i < c.length ; i++){
            for(int j = 0 ; j < c[i].length ; j++){
                System.out.print(c[i][j] + " | ");
            }
            System.out.println();
        }

        // a matrix replace value with *
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print("*" + " | ");
            }
            System.out.println();
        }
    }


}
