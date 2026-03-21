package ex_08_Strings;

public class Lab081_String_reverseMethod {
    public static void main(String[] args) {

        // Reverse Method without using inbuilt Method
        String st = "Java";
        String r = "";
        for (int i = st.length() -1 ; i >= 0 ; i--) {
          r =  r + st.charAt(i);
            System.out.println(r);
        }
    }
}
