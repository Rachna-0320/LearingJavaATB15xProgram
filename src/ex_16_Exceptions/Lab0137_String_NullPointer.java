package ex_16_Exceptions;

public class Lab0137_String_NullPointer {
    public static void main(String[] args) {
        String name = null;
        name.trim();            // NullPointerException
        System.out.println(name.trim());

        //This code throws a NullPointerException
        // because we are trying to call a method on a null reference.”

    }
}
