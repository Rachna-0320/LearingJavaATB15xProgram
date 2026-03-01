package ex_03_Type_Casting;

public class Lab024_CLI_User_Input {
    public static void main(String[] args) {

//        A user will give input of age.
//        You have to check if the user is minor, adult, or senior citizen.

        String age = args[0] ;
//        System.out.println(age instanceof String);
        int age1 = Integer.parseInt(age) ;

        String result = (age1 < 18) ? "Minor" : (age1 <= 60 ) ? "Adult" : "Sr. Citizen" ;
        System.out.println(result);

    }
}
