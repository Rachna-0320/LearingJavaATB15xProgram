package ex_04_Increment_Decrement_Operators;
import java.util.Scanner;
public class Lab031_If_Else_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");

        if (input.hasNextInt()) {

            int age = input.nextInt();

            System.out.println(age);

            if (age > 20) {
                System.out.println("It is my age");
            } else {
                System.out.println("It is not my age");
            }
        } else {
                System.out.println("enter valid int");
         }
        }
    }

