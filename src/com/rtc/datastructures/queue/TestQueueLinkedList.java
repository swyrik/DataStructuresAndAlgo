package com.rtc.datastructures.queue;

public class TestQueueLinkedList {

    public static void main(String[] args) {
        QueueLinkedList<String> queueLl = new QueueLinkedList<>();

        System.out.println("isEmpty: "+queueLl.isEmpty());
        System.out.println("isFull: "+queueLl.isFull());
        System.out.println("size: "+queueLl.getSize());

        queueLl.enqueue("Java");

        System.out.println("\nContents: "+queueLl.toString());

        queueLl.enqueue("Javascript");
        queueLl.enqueue("Go");
        queueLl.enqueue("Python");
        queueLl.enqueue("Erlang");
        queueLl.enqueue("C");

        System.out.println("\nContents: "+queueLl.toString());
        System.out.println("size: "+queueLl.getSize());
    }
}
