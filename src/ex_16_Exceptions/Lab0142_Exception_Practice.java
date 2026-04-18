package ex_16_Exceptions;

public class Lab0142_Exception_Practice {
    public static void main(String[] args) {

        try{
            String s = args[0];
            int a = Integer.parseInt(s);
            int b = 100 / a;
            System.out.println(b);
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

        // This is the Better Exceptions Handling
        try{
            String s = args[0];
            int a = Integer.parseInt(s);
            int b = 100 / a;
            System.out.println(b);
        }catch ( ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e ){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Better code for exceptional handling");
        }



    }


}
