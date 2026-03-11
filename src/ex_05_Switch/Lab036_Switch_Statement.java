package ex_05_Switch;
import java.util.Scanner;
public class Lab036_Switch_Statement {
    public static void main(String[] args) {
//        Problem
// You need to take a user input and ask for the integer from 1 to 7.
//        // And if user enters 1 to 7, 1- Mon,
//        // you will tell which day it is.

// Logic Building Formula
// Step 1 - Number one is using the Scanner class.
// Step 2 - number two will be basically figuring out the expression and the day.
// Step 3- We will basically add step 3 as a rough logic.
// Step 4 - 4 is you will write the fix the logic and optimize.
// Step 5 - figure out the edge cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");

        if (scanner.hasNextInt()) {

            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter valid number from 1 to 7");
                    break;
            }
        }
        else {
            System.out.println("Invalid int is entered");
        }
        System.out.println("End of the Program");

   scanner.close();
    }
}
