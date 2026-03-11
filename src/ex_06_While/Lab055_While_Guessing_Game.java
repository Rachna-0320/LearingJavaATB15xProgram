package ex_06_While;

import java.util.Random;
import java.util.Scanner;

public class Lab055_While_Guessing_Game {
    public static void main(String[] args) {
// Guess a number from 1 to 100
        Random random = new Random() ;
        int numberToGuess = random.nextInt(100) ;
//        System.out.println(numberToGuess);

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a Number");
        int guess ;
        int attempts = 0;

        while (true) {
          if (!sc.hasNext()) {
              System.out.println("Invalid Input");
              sc.next();
              continue;
          }
           guess = sc.nextInt();
           attempts++;

          if (guess < numberToGuess) {
              System.out.println("Too Low,Try again !!");
          } else if (guess > numberToGuess){
              System.out.println("Too High, Try again!!");
          } else {
              System.out.println("Correct! You have taken -> " + attempts);
              break;
          }
        }
        }
    }

