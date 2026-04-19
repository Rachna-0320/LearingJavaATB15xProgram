package ex_17_Enum;

public class Lab0149_Enum_Practice {
    public static void main(String[] args) {

        Day today = Day.Thursday;

        switch (today) {
            case Monday:
                System.out.println("Monday");
                break;
            case Thursday:
                System.out.println("Thursday");
                break;
            case Friday:
                System.out.println("Friday");
        }
    }
}