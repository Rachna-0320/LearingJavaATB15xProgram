package ex_05_Switch;

public class Lab037_char_Switch {
    public static void main(String[] args) {
        char ch = 'A' ;
        switch (ch) {
            case 65 :
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");
        }

        long a = 30l ;
        switch ((int) a) {
            case 30 :
                System.out.println("Narrowing / Explicit");
                break;
            case 31 :
                System.out.println("Not Narrowing");
                break;
            default :
                System.out.println("No match");
                break;
        }
    }
}
