package ex_03_Type_Casting;

public class Lab023_Max_Three_Number {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]) ;
        int n2 = Integer.parseInt(args[1]) ;
        int n3 = Integer.parseInt(args[2]) ;

        int result = (n1 > n2) ? n1 : (n2 > n3) ? n2 : n3 ;
        System.out.println("Max out of three = " + result);



        int a1 = 2;
        int a2 = 9;
        int a3 = -11;

        int a4 = (a1 < a2) ? (a2 > a3 ? a2 : a3) : a1 ;
        System.out.println("Max out of three = " + a4);


    }
}
