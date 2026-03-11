package ex_05_Switch;

public class Lab039_Switch_Example {
    public static void main(String[] args) {
        int a = 100;
        switch (a) {
            case 100 :
                System.out.println("100");
//            case 100 :                         2 Same cases are not allowed
//                System.out.println("50");
        }

//        After JDK 13     (it is valid)
        int b = 1202;
        switch (b) {
            case 1206 -> System.out.println("501");
            case 0203 -> System.out.println("041");
            case 1202 -> System.out.println("0031");
            default -> System.out.println("default");
//      This is called the enhanced switch statement (introduced in Java 14).
//      Java automatically stops after executing the matched case. (it is new syntax)
//      So no break is needed.
        }

//      After JDK 13   (it is valid)
        int c = 200 ;
        switch (c) {
            case 305, 800 , 789:
                System.out.println("This is can run");
                break ;
            case 300, 200, 100 :
                System.out.println("This is valid");
                break;
            default :
                System.out.println("None");
        }

        int d = 11;
        switch (-11) {
            default  :
                System.out.println("Default");
            case -1 :
                System.out.println("10");
                break ;
            case 9 :
                System.out.println("9");
                break;
        }
    }
}
