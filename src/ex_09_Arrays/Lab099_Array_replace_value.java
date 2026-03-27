package ex_09_Arrays;

public class Lab099_Array_replace_value {
    public static void main(String[] args) {

        int[] num = {30, 50, 70, 10,100};
        num[0] = 30;
        num[1] = 50;
        num[1] = 40;
        num[2] = 70;

        for(int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
        }


    }
}
