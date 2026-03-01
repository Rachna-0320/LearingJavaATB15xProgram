package ex_03_Type_Casting;

public class Lab022_Even_Odd {
    public static void main(String[] args) {
        int num = 14;
        String result = (num%2 == 0) ? "even" : "odd" ;
        System.out.println(result);

        int num2 = 13;
        String result2 = (num2%2 == 0) ? "even" : "odd" ;
        System.out.println(result2);
    }
}
