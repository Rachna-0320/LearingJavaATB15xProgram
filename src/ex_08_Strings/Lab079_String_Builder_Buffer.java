package ex_08_Strings;

public class Lab079_String_Builder_Buffer {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("Rachna") ;
        s = s.reverse();
        System.out.println(s);

        StringBuffer b = new StringBuffer("Java ");
        System.out.println(b.reverse());

        StringBuffer c = new StringBuffer("madam ") ;
        System.out.println("madam" + c.reverse());

        StringBuffer d = new StringBuffer("A");
        StringBuffer e  = d.append("AB");
        d = e.append("ABC");
        System.out.println(d);

        StringBuilder f = new StringBuilder("A");
        StringBuilder g = f.append("AB");
        f = g.append("ABC");
        System.out.println(f);

        StringBuilder sb = new StringBuilder("Hello") ;
        sb.append("World");
        sb.reverse();
        System.out.println(sb);



    }
}
