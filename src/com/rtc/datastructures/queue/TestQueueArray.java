package com.rtc.datastructures.queue;

public class TestQueueArray {

    public static void main(String[] args) throws QueueOverFlowException, QueueUnderFlowException {
        Queue<String> strs = new Queue<>(String.class);
//        System.out.println(strs.isEmpty());
//        System.out.println(strs.isFull());
//        System.out.println(strs.size());

        strs.enqueue("python");
        System.out.println("\nContents: "+strs);

        strs.enqueue("java");
        strs.enqueue("go");
        strs.enqueue("C");
        System.out.println("\nContents: "+strs);

        strs.dequeue();
        System.out.println("\nContents: "+strs);

        strs.dequeue();
        System.out.println("\nContents: "+strs);

        strs.enqueue("javascript");
        strs.enqueue("c++");
        strs.enqueue("erlang");
        strs.enqueue("html");
        strs.enqueue("css");
        strs.enqueue("ruby");
        System.out.println("\nContents: "+strs);

        strs.enqueue("kotlin");
        System.out.println("\nContents: "+strs);

        System.out.println("peek element : "+strs.peek());

        strs.dequeue();
        strs.dequeue();
        System.out.println("\nContents: "+strs);
        System.out.println("peek element : "+strs.peek());
    }
}
