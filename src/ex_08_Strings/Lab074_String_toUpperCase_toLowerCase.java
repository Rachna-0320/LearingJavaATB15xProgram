package ex_08_Strings;

public class Lab074_String_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String code = "Java" ;
        code = code.toUpperCase() ;
        System.out.println(code);

        System.out.println(code.contains("A"));           // true
        System.out.println(code.contains("a"));          // false

        System.out.println("=".repeat(5));

        System.out.println(code.toLowerCase());      // Converts: "JAVA" → "java". Output: "java" (but not stored)
        System.out.println(code.contains("a"));      //  false
        // Important: Strings are immutable in Java
        // toLowerCase() returns a new String
        // If not stored, the original value remains unchanged
        // code is STILL → "JAVA"

        System.out.println("=".repeat(5));

        code = code.toLowerCase();
        System.out.println(code);
        System.out.println(code.contains("A"));      // false
        System.out.println(code.contains("a"));      // true

    }
}
