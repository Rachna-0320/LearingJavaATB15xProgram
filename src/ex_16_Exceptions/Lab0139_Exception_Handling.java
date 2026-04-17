package ex_16_Exceptions;

public class Lab0139_Exception_Handling {
    public static void main(String[] args) {

        String name = null;
        try{
            name.trim();
            int a = 90;
        }catch ( NullPointerException | ArithmeticException e ){
            System.out.println("Null Pointer Exception or Arithmetic Exception");
        }
    }
}
