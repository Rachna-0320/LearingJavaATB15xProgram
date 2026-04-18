package ex_16_Exceptions;

public class Lab0140_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        try{
          int  b = 10 / a;
            System.out.println(b);
        } catch (Exception e){
          System.out.println(e.getMessage()); // It will only Print message
           // e.printStackTrace();       //  It prints detailed information about the exception.
        } finally {         // finally is a block that always executes, whether exception occurs or not.
            System.out.println("I will be always executed!");
        }
    }
}
