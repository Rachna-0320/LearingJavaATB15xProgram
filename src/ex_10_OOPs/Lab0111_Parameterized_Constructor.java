package ex_10_OOPs;
public class Lab0111_Parameterized_Constructor{
    public static void main(String[] args) {

    Cats c1 = new Cats("Oggy");
    Cats c2 = new Cats("Lucy");

    System.out.println(c1.name);
    System.out.println(c2.name);
    }
}
 class Cats {
    String name;

    Cats(String nameGiven) {
        this.name = nameGiven;
//        name = "Kitty";
    }
}