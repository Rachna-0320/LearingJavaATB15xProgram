package ex_21_Collection_Framework_Queue_Map;

import java.util.*;

public class Lab0185_ArrayDeque_Practice {
        public static void main(String[] args) {

            Deque<Integer> dq = new ArrayDeque<>();

            dq.addFirst(450);
            dq.addLast(33);
            dq.addFirst(0);
            dq.addLast(690);
            dq.addFirst(20);

            System.out.println("Deque: " + dq);

            System.out.println("First Element: " + dq.peekFirst());
            System.out.println("Last Element: " + dq.peekLast());

            System.out.println("Removed First: " + dq.pollFirst());
            System.out.println("Removed Last: " + dq.pollLast());

            System.out.println("Deque after removal: " + dq);
        }
}

