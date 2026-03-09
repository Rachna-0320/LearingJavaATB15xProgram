package ex_05_Switch;

public class Lab042_For_If_Loop {
    public static void main(String[] args) {
        for (int Rachna = 0 ; Rachna < 30 ; Rachna++) {
            if (Rachna > 28) {
                System.out.println("Rachna can travel alone to Goa");
            } else if (Rachna >= 28) {
                System.out.println("Rachna can go to Goa");
            } else {
                System.out.println("Rachna can't go to Goa");
            }
        }
    }
}
