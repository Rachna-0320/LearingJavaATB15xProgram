package ex_17_Enum;

public class Lab0148_Enum_Program {
    public static void main(String[] args) {

        Day today = Day.Thursday;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());     // zero-indexed position

    }
}
