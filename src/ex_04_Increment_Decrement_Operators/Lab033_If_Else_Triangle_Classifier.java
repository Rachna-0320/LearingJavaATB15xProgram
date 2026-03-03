package ex_04_Increment_Decrement_Operators;
import java.util.Scanner;
public class Lab033_If_Else_Triangle_Classifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("Triangle is Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Triangle is Isosceles");
        }else {
            System.out.println("Triangle is Scalene");
        }
    }
}
