package ex_16_Exceptions;

public class Lab0135_Unchecked_Exception {
    public static void main(String[] args) {

        System.out.println("Starting the Program");
        try {
            String user_input = args[0];
            int a = Integer.parseInt(user_input);
            int result = 100 / a;
            System.out.println("Result:" + result);

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException |ArithmeticException e ){
            System.out.println("Exception occurred: " + e.getMessage());
        }
        System.out.println("End the Program");
    }
}

// Unchecked Exception
//        System.out.println("Starting the Program");
//        String user_input = args[0]; //java.lang.ArrayIndexOutOfBoundsException
//        int a = Integer.parseInt( user_input ); // java.lang.NumberFormatException
//        int output = 100/a; // java.lang.ArithmeticException
//        System.out.println(output);
//        System.out.println("End the Program");


// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//  java.lang.NumberFormatException: For input string: "Rachna"
// // java.lang.ArithmeticException: / by zero