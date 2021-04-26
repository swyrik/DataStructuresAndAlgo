package com.rtc.datastructures.queue;

public class TestCircularQueueArray {

    public static void main(String[] args) throws QueueOverFlowException, QueueUnderFlowException {
        CircularQueue<String> cq = new CircularQueue<>(String.class);

        System.out.println("\nis empty "+cq.isEmpty());
        System.out.println("\nis full "+cq.isFull());

        cq.enqueue("Java");

        System.out.println("\nis empty "+cq.isEmpty());
        System.out.println("\nis full "+cq.isFull());
        System.out.println("\nContents: "+cq.toString());
        System.out.println("\npeek: "+cq.peek());

        cq.enqueue("javascript");
        cq.enqueue("go");
        cq.enqueue("html");
        cq.enqueue("css");
        cq.enqueue("c");
        cq.enqueue("c++");
        cq.enqueue("ruby");
        cq.enqueue("dart");
        cq.enqueue("Ts");
        System.out.println("\nContents: "+cq.toString());
        System.out.println("\npeek: "+cq.peek());

        cq.dequeue();
        cq.dequeue();
        cq.dequeue();

        System.out.println("\nContents: "+cq.toString());
        System.out.println("\npeek: "+cq.peek());

        cq.enqueue("python");
        cq.enqueue("jython");
        cq.enqueue("kython");
        System.out.println("\nContents: "+cq.toString());
        System.out.println("\npeek: "+cq.peek());

        cq.enqueue("matlab");
    }
}
