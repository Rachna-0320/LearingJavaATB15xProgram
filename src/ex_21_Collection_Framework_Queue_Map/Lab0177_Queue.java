package ex_21_Collection_Framework_Queue_Map;

import java.util.Objects;
import java.util.PriorityQueue;

public class Lab0177_Queue {
    public static void main(String[] args) {

        // FIFO
        PriorityQueue pq = new PriorityQueue<>();
        pq.add("Java");
        pq.add("Code");
        pq.add("Program");
        pq.add("Python");
        pq.offer("C++");
        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq);

    }
}
