package ex_21_Collection_Framework_Queue_Map;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab0178_ArrayDeque {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(45);
        dq.push(3);
        dq.push(0);
        dq.push(60);
        dq.push(2);

        System.out.println(dq);

    }
}
