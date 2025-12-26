package ex_02_Java_Basics;

import java.sql.SQLOutput;

public class Lab004_Local_Variable {
    public static void main(String[] args) {
//        Variable - Local Variable
         byte age_Rachna = 25 ;
//         byte -> Data type -> type of container
//        age_Rachna -> Variable_name
//        = -> Assignment Operator
//        25 -> Variable value / Literal
//        System.out.println(age_Rachna);
        age_Rachna = 26 ;
        age_Rachna = 27 ;
//        Why Variable is important because to can change the value of variable
//        System.out.println(age_Rachna);


//        If I want to store the age of a person then which data type I use
//        byte, short, int, etc
        int age = 122 ;
        short age_s = 122 ;
        byte age_b = 122 ;
//        using int, short memory get waste because max. age of person is 122 only
//        byte can store counting till 127 ONLY
        byte age_a = 127 ;
//        byte age_c = 128 ;  give error
        System.out.println(age_a);
        int age_A = 128 ;
        System.out.println(age_A);
    }
}
