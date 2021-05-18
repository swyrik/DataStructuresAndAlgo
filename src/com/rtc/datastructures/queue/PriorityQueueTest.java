package com.rtc.datastructures.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue <>();
        priorityQueue.add("Java");
        priorityQueue.add("JavaScript");
        priorityQueue.add("Go");
        priorityQueue.add("C++");

        print(priorityQueue);

        PriorityQueue<String> customPriorityQueue = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
        customPriorityQueue.add("Java");
        customPriorityQueue.add("JavaScript");
        customPriorityQueue.add("Go");
        customPriorityQueue.add("C++");
        print(customPriorityQueue);
    }

    private static void print(PriorityQueue<String> customPriorityQueue) {
        for (String str : customPriorityQueue) {
            System.out.println(str);
        }
    }
}
