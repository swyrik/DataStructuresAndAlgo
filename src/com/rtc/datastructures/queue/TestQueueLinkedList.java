package com.rtc.datastructures.queue;

public class TestQueueLinkedList {

    public static void main(String[] args) throws QueueUnderFlowException {
        QueueLinkedList<String> queue = new QueueLinkedList<>();

        System.out.println("isEmpty: "+queue.isEmpty());
        System.out.println("isFull: "+queue.isFull());
        System.out.println("size: "+queue.getSize());

        queue.enqueue("Java");

        System.out.println("\nContents: "+queue.toString());
        System.out.println("\npeek: "+queue.peek());

        queue.enqueue("Javascript");
        queue.enqueue("Go");
        queue.enqueue("Python");
        queue.enqueue("Erlang");
        queue.enqueue("C");

        System.out.println("\nContents: "+queue.toString());
        System.out.println("size: "+queue.getSize());
        System.out.println("\npeek: "+queue.peek());

        queue.dequeue();
        queue.dequeue();
        System.out.println("\nContents: "+queue.toString());
        System.out.println("size: "+queue.getSize());
        System.out.println("\npeek: "+queue.peek());

    }
}
