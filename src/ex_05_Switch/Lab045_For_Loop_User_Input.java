package ex_05_Switch;

import java.util.Scanner;

public class Lab045_For_Loop_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int i = sc.nextInt();
        for ( ; i > 5 ; i++) {
            System.out.println(i);
        }
        System.out.println("End");
        for (i = 0 ; i <= 50 ; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

    }
}
