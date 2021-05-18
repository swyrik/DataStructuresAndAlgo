package com.rtc.datastructures.queue;

public class TestQueueWithStacks {

    public static void main(String[] args) throws QueueUnderFlowException {

        QueueWithStacks<String> queue = new QueueWithStacks<>();

        System.out.println("isEmpty: "+queue.isEmpty());
        System.out.println("size: "+queue.size());

        queue.enqueue("Java");

        System.out.println("\nContents: "+queue.toString());
        System.out.println("\npeek: "+queue.peek());

        queue.enqueue("Javascript");
        queue.enqueue("Go");
        queue.enqueue("Python");
        queue.enqueue("Erlang");
        queue.enqueue("C");

        System.out.println("\nContents: "+queue.toString());
        System.out.println("size: "+queue.size());
        System.out.println("\npeek: "+queue.peek());

        queue.dequeue();
        queue.dequeue();
        System.out.println("\nContents: "+queue.toString());
        System.out.println("size: "+queue.size());
        System.out.println("\npeek: "+queue.peek());

    }

}
