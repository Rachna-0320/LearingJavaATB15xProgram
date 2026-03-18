package ex_08_Strings;

import java.sql.SQLOutput;

public class Lab072_String_Contains {
    public static void main(String[] args) {

        String name = "Rachna" ;
        boolean result = name.contains("a") ;
        System.out.println(result);         // true

        System.out.println(name.contains("ah"));        // false

        name = name.toUpperCase();
        System.out.println(name.contains("H"));     // true
        System.out.println(name.contains("CH"));    // true
        System.out.println(name.contains("h"));     // false

        name = name.toLowerCase();
        System.out.println(name.contains("h"));     // true

        if(name.contains("n")){
            System.out.println("Yes it contain");
        } else {
            System.out.println("No it does not contain");
        }
    }
}
// contains() is a method of String class
//👉 contains() just reads the string,
//✔️ “contains() does not modify the original string, it only checks and returns boolean”
// ✅ contains() always returns a boolean value.