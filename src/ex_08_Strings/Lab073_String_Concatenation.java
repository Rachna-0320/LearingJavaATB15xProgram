package ex_08_Strings;

public class Lab073_String_Concatenation {
    public static void main(String[] args) {
//        1st way
        String name = "Java" ;                            // Java -> String pool
        name = name.concat(" Programming") ;         // Programming -> string pool
        System.out.println(name);                       // Java Programming -> Heap area

//        2nd way
        String fruits = "Apple" ;
        System.out.println(fruits.concat(" Papaya" + " Banana"));

//        3rd way
        String program = new String("Kapil");
        program = program + " Sharma";                       // Sharma -> String pool
        // This is concatenation using + operator
        System.out.println(program + " age: " + 44 );
    }
}
//Concatenation = joining two or more strings
//Combine strings together to make one string
// * A String object "Java" is created
// * name stores its reference
//	•	String is immutable
//	•  creates a new object -> name → "Java Programming"

//      Before:                         After:
//      name → "Java"                 name → "Java Programming"

// Important points
//• + is used for concatenation
//• Creates a new String object
//• Original string is not changed
//• You can join:
//	•	String + String
//	•	String + number