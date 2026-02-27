package ex_03_Type_Casting;

public class Lab019_Ternary_Operators {
    public static void main(String[] args) {

//        int age = 26;
//        String Rachna = age < 25 ? "Yes" : "No";
//        System.out.println(Rachna);

        int age1 = 25;
        String canRachnaGotoGoa = age1 > 18 ? "Yes" : "No";
        System.out.println(canRachnaGotoGoa);

        int a = 5;
        String result = a > 0 ? "+ve" : "-ve";
        System.out.println(result);

        int b = 10;
        boolean b1 = b > 10 ? true : false;
        System.out.println(b1);

        int marks = 40;
        String Student = (marks >= 40) ? "Pass" : "Fail" ;
        System.out.println(Student);
    }
}
