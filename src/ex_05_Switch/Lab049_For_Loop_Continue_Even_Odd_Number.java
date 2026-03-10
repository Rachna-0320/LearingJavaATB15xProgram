package ex_05_Switch;

public class Lab049_For_Loop_Continue_Even_Odd_Number {
    public static void main(String[] args) {
//     For loop continue for Even Number
//        for (int i = 0 ; i <= 50 ; i++) {
//            if (i % 2 == 0) {
//                 continue;
//            }
//            System.out.println(i);
//        }
//        For loop continue for Odd Number, but we get Even N umber
        for (int i = 0 ; i <= 50 ; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
