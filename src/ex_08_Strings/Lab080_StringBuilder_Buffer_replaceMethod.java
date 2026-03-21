package ex_08_Strings;

public class Lab080_StringBuilder_Buffer_replaceMethod {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java ") ;
        sb.append("Programming");
        System.out.println(sb);

        sb.replace(0, 4, "Python");
        System.out.println(sb);

        StringBuilder bs = new StringBuilder("Nana");
        bs.replace(3, 4, "o");
        System.out.println(bs);

        StringBuffer a = new StringBuffer("Java");
        a.append("Program") ;
        a.insert(4," Code ");
        System.out.println(a);

        StringBuilder b = new StringBuilder("Hello World");
        b.delete(5, 11 );
//        b.append("Java");
        System.out.println(b);
        System.out.println(b.length());

        StringBuilder st = new StringBuilder("Java") ;
        String str = st.toString();
        System.out.println(str);

    }
}
