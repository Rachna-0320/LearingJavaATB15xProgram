package ex_19_Collection_Framework_LIST;

import java.util.Stack;

public class Lab0169_Stack {
    public static void main(String[] args) {
        // Last In First Out
        Stack<String> name = new Stack<>();

        name.add("Riya");
        name.add("Priya");
        name.add("Nirav");
        name.add("Uma");
        name.add("Rakhi");

        System.out.println(name);
        System.out.println(name.size());
        System.out.println("=".repeat(10));

        System.out.println(name.peek());
        System.out.println(name);
        System.out.println("=".repeat(10));

        System.out.println(name.pop());
        System.out.println(name);
        System.out.println("=".repeat(10));

        System.out.println(name.add("Reena"));
        System.out.println(name);
        System.out.println("=".repeat(10));

        name.add(2,"Reena");
        name.add("Parit");
        name.push("Moni");
        System.out.println(name);
        System.out.println("=".repeat(10));

        name.addFirst("Madhu");
        name.addLast("Vijay");
        System.out.println(name);


    }
}
