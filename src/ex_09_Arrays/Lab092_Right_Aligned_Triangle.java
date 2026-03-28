package ex_09_Arrays;

public class Lab092_Right_Aligned_Triangle {
    public static void main(String[] args) {

        int n = 6;
        for(int i = 0 ; i < n ; i++) {

            // Print spaces
            for (int space = 0 ; space < n - i - 1 ; space++) {
                System.out.print(" ");
            }
            // Print stars
       for (int star = 0 ; star <= i ; star++) {
           System.out.print("*");
       }
            System.out.println();
        }
    }
}
