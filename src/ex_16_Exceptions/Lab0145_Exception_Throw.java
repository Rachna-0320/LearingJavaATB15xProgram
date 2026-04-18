package ex_16_Exceptions;

public class Lab0145_Exception_Throw {
    public static void main(String[] args) {
        try {
            dividedByZero(2);   // change value to test
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program End");


    }

    static void dividedByZero(int a) {
        if (a == 0) {
            throw new ArithmeticException("Error a == 0");

        } else {
            System.out.println(10 / a);
        }
    }
}