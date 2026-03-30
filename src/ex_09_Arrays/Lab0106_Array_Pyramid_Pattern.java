package ex_09_Arrays;

public class Lab0106_Array_Pyramid_Pattern {
    public static void main(String[] args) {

        int n = 15;

        // Pyramid star pattern
        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for(int k = 0; k < 2*i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
