package ex_16_Exceptions;

public class Lab0138_Try_catch_HandleException {;
    public static void main(String[] args) {

        int a = 10;
        try {
            a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Division by zero not allowed in Java!");
        }
        System.out.println(a);


        System.out.println("1");
        try{
            int b = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Exception Handling");
        }
        System.out.println("2");


        int c = 20;
        try{
            c = 20 / 0 ;
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic is smaller class");
        }catch (Exception e){
            System.out.println(" Exception is bigger class");
        }//catch (ArithmeticException e) {} // not allow after bigger class because bigger at last

    }

}


