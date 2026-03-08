package ex_03_Type_Casting;

public class Lab020_Nested_Ternary {
    public static void main(String[] args) {

        int Rachna_age = 23;
        String result = Rachna_age > 21  ? (Rachna_age > 22 ? "You can drink" : "You can't") : "No you can't go to Goa";
        System.out.println(result);

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int n4 = (n1 < n2) ? (n2 > n3 ? n2 : n3) : (n1) ;
        System.out.println("Max out of three = " + n4);


    }
}
