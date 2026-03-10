package ex_05_Switch;

import java.util.Scanner;

public class Lab047_For_Loop_Break_User_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int i = sc.nextInt();

        for ( ; i < 50 ; i++ ) {
//            System.out.println(i);
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
