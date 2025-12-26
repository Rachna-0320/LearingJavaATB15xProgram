package ex_02_Java_Basics;

public class Lab007_printF {
    public static void main(String[] args) {
//        System.out.println("Hello"); println -> print output and move to next line
//        System.out.print("Hello"); print -> print output and not move to next line

//        System.out.printf("Hello"); Printf -> print and not move to the next line

        int a = 10;
//        System.out.println("value of a = " +a); output -> value of a = 10
//        System.out.printf("value of a %d" ,a); output -> value of a 10
//         %d means -> print an integer.
//        %d -> integer
//        %s -> String
//        %f -> float
//        %b -> boolean

       int b = 9;
        System.out.printf("%d * 1 = %d%n",b,b* 1);
        System.out.printf("%d * 2 = %d%n",b,b* 2);
        System.out.printf("%d * 3 = %d%n",b,b* 3);
        System.out.printf("%d * 4 = %d%n",b,b* 4);
        System.out.printf("%d * 5 = %d%n",b,b* 5);
        System.out.printf("%d * 6 = %d%n",b,b* 6);
        System.out.printf("%d * 7 = %d%n",b,b*7 );
        System.out.printf("%d * 8 = %d%n",b,b* 8);
        System.out.printf("%d * 9 = %d%n",b,b* 9);
        System.out.printf("%d * 10 = %d%n",b,b* 10);

    }
}
