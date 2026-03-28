package ex_09_Arrays;

public class Lab090_2DArray {
    public static void main(String[] args) {

        // Printing 2D array using nested loops
        int[][] matrix = {
                {1, 2, 3} ,
                {4, 5, 6} ,
                {7, 8, 9}
        };

    for (int i = 0 ; i < matrix.length ; i++){
        for (int j = 0 ; j < matrix[i].length ; j++) {
            System.out.print(matrix[i][j]  + " | ");
        }
        System.out.println("");
    }

        int[][] array_2D = {
            {10, 20},
            {30, 40},
            {50, 60}
    };
    for (int i = 0 ; i < array_2D.length ; i++ ){
        for(int j = 0 ; j < array_2D[i].length ; j++){
            System.out.print(array_2D[i][j] + " | ");
        }
        System.out.println();
    }

//    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8,9}};
//    int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

    }
}
