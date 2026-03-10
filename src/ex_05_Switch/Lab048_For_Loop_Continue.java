package ex_05_Switch;
import java.util.Scanner ;
public class Lab048_For_Loop_Continue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a Number") ;
        int num = sc.nextInt();

        for (int i = 0; i < num ; i++) {
//            System.out.println(i);
            if (i == 5) {
              continue;
            }
            System.out.println(i);
        }
    }
}
