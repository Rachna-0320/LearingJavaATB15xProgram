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

        System.out.println("Stack: " + name);
        System.out.println("Size: " + name.size());
        System.out.println("=".repeat(10));

        System.out.println("Top element (peek): " + name.peek());
        System.out.println("Stack after peek: " + name);
        System.out.println("=".repeat(10));

        System.out.println("Removed (pop): " + name.pop());
        System.out.println("Stack after pop: " + name);
        System.out.println("=".repeat(10));

        name.push("Reena");
        
        System.out.println("After push: " + name);
        name.push("Parit");
        System.out.println("Final Stack: " + name);
    }
}
