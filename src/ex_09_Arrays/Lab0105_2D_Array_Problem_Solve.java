package ex_09_Arrays;

public class Lab0105_2D_Array_Problem_Solve {
    public static void main(String[] args) {

        int[][] num = {
                {45, 25, 1},
                {50, 20, 2}
        };

        // 1. Sum of 2D array
        int sum = 0;
        for(int i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num[i].length ; j++){
                sum = sum + num[i][j];
            }
        }
        System.out.println("Sum: " + sum);

        // 2. Subtraction
        int sub = num[0][0];
        for(int i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num[i].length ; j++){

                if(i == 0 && j == 0) continue;
                sub = sub - num[i][j];
            }
        }
        System.out.println("Subtraction: " + sub);

        // 3. Multiplication
        int mul = 1;
        for(int i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num[i].length ; j++){
                mul = mul * num[i][j];
            }
        }
        System.out.println("Multiplication: " + mul);

        // 4. Division
        int div = num[0][0];
        for(int i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num[i].length ; j++){

                if(i == 0 && j == 0)continue;
                div = div / num[i][j];
            }
        }
        System.out.println("Division: " + div);

        // 5. Maximum
        int max = num[0][0];
        for(int i = 0 ; i < num.length ; i++){
            for (int j = 0 ; j < num[i].length ; j++){

              if( num[i][j] > max ) {
                  max = num[i][j];
              }
            }
        }
        System.out.println("Max: " + max);

        // 6. Second Maximum
        int max2 = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < num.length ; i++){
            for (int j = 0 ; j < num[i].length ; j++){

                if( num[i][j] > max2) {
                    secondMax = max2;
                    max2 = num[i][j];
                } else if (num[i][j] > secondMax && num[i][j] != max2){
                    secondMax = num[i][j];
                }
            }
        }
        System.out.println("Second Max: " + secondMax);

        // 7. Minimum
        int min = num[0][0];
        for(int i = 0 ; i < num.length ; i++){
            for (int j = 0 ; j < num[i].length ; j++){
                if( num[i][j] < min) {
                    min = num[i][j];
                }
            }
        }
        System.out.println("Min: " + min);

        // 8. Second Minimum
        int min2 = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0 ; i < num.length ; i++){
            for (int j = 0 ; j < num[i].length ; j++){

                if( num[i][j] < min2 ) {
                    secondMin = min2;
                    min2 = num[i][j];
                } else if (num[i][j] < secondMin && num[i][j] != min2){
                    secondMin = num[i][j];
                }
            }
        }
        System.out.println("Second Min: " + secondMin);
    }
}
