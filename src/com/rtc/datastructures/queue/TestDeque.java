package com.rtc.datastructures.queue;

public class TestDeque {

    public static void main(String[] args) throws QueueUnderFlowException {
        Deque<String> deque = new Deque<>();
        System.out.println("size "+deque.size());
        System.out.println("is empty "+deque.isEmpty());

        deque.addFirst("Java");
        deque.addFirst("JavaScript");
        deque.addLast("go");
        deque.addLast("C++");

        System.out.println(deque.toString());
        System.out.println("size "+deque.size());
        System.out.println("is empty "+deque.isEmpty());
        System.out.println("peek first "+deque.peekFirst());
        System.out.println("peek last "+deque.peekLast());
        System.out.println("\n\n");

        deque.removeFirst();

        System.out.println(deque.toString());
        System.out.println("size "+deque.size());
        System.out.println("peek first "+deque.peekFirst());
        System.out.println("peek last "+deque.peekLast());
        System.out.println("\n\n");

        deque.removeLast();

        System.out.println(deque.toString());
        System.out.println("size "+deque.size());
        System.out.println("peek first "+deque.peekFirst());
        System.out.println("peek last "+deque.peekLast());
        System.out.println("\n\n");




    }
}
