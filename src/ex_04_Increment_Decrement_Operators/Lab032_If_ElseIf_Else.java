package ex_04_Increment_Decrement_Operators;
import java.util.Scanner;
public class Lab032_If_ElseIf_Else {
    public static void main(String[] args) {
//        int age = 18;
//        if ( age > 18 ) {
//            System.out.println("age > 18");
//        } else if ( age < 18 ) {
//            System.out.println("age < 18");
//        } else {
//            System.out.println("age == 18");
//        }

        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt() ;
        if (age1 == 18){
            System.out.println("You can go to Goa");
        } else if (age1 < 18 ){
            System.out.println("You can't go to Goa");
        }else {
            System.out.println("You can to go to Goa and Drink");
        }

        sc.close();
    }


}
