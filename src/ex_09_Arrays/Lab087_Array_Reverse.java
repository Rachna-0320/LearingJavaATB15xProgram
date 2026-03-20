package ex_09_Arrays;

public class Lab087_Array_Reverse {
    public static void main(String[] args) {

        String[] names = {"Uma", "Nirav", "Rcahna", "Moni", "Uttam", "Somdev"} ;

        for (int i = names.length - 1 ; i >= 0 ; i--) {
            System.out.println(names[i]);
        }
    }
}
