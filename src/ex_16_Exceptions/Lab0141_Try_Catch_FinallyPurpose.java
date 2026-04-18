package ex_16_Exceptions;

import java.util.Scanner;

public class Lab0141_Try_Catch_FinallyPurpose {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter User Input");

        int user_Input = sc.nextInt();
        try{
            int b = 10 / user_Input;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("End of program, sc close!");
        }
    }
}
