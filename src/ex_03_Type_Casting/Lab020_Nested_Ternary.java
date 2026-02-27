package ex_03_Type_Casting;

public class Lab020_Nested_Ternary {
    public static void main(String[] args) {

        int Rachna_age = 25;
        String result = Rachna_age > 26  ? (Rachna_age > 24 ? "You can drink" : "You can't") : "No you can't go to Goa";
        System.out.println(result);
    }
}
