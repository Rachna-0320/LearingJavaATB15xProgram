package ex_05_Switch;

public class Lab043_For_Loop_Example {
    public static void main(String[] args) {
//        for (byte i = 0 ; i < 5 ; i++) {
//            System.out.println("Hello");
//        }

//        for (int i = 10 ; i > 1 ; i-- ) {
//            System.out.println(i);
//        }

//  for (int a = 5 ; a > 0 ; a--) {
//      System.out.println("Hello");
//  }

//        for (int b = 0 ; b <= 5 ; b++) {
//            System.out.println(b);
//        }

        int c = 5;
        for (;c < 10 ; c++) {           // c++ and ++c both are same
            System.out.println(c);

        }

        int d = 5;
        for (;d < 10 ; ++d) {
            System.out.println(d);
        }
    }
}
