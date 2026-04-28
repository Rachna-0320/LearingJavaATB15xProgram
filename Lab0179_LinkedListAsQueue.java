package ex_21_Collection_Framework_Queue_Map;

import java.util.*;
public class Lab0179_LinkedListAsQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(38);
        queue.add(1);
        queue.add(0);
        queue.add(52);
        queue.add(100);

        System.out.println("Queue: " + queue);
        System.out.println("Peek (head): " + queue.peek());

        System.out.println("Removed (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        System.out.println("=".repeat(10));

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
