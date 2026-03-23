package ex_09_Arrays;

public class Lab095_Array_Examples {
    public static void main(String[] args) {

        int[] a = {10, 48, 53, 80};
        a[0] = 10;
        a[1] = 53;
        a[2] = 48;
        a[3] = 80;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        for (int i = 0 ; i < a.length ; i++){    // Using for loop
            System.out.println(a[i]);            // when you need index
        }

        for (int a1 : a ) {                       // Using for-each loop
            System.out.println(a1);               // No index needed
        }

        int[] b = new int[3];
        b[0] = 20;
        b[1] = 40;
        b[2] = 60;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        for(int i = 0 ; i < b.length ; i++) {
            System.out.println(b[i]);
        }

        for (int b1 : b) {
            System.out.println(b1);
        }

        String[] st = new String[2] ;

        System.out.println(st[0]);
        System.out.println(st[1]);     // default value of String is null

        int[] in = new int[2];

        System.out.println(in[0]);
        System.out.println(in[1]);     // default value of int is 0
    }
}
