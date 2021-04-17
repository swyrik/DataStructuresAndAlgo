package com.rtc.datastructures.stacks;

import javafx.scene.shape.StrokeLineCap;

public class TestStackArray {

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        System.out.println("is empty " +stack.isEmpty());
        System.out.println("is size " +stack.size());
        System.out.println("is full " +stack.isFull());

        try {
            stack.push("Java");
            stack.push("python");
            stack.push("kotlin");
            stack.push("Go");

            System.out.println("is empty " +stack.isEmpty());
            System.out.println("is size " +stack.size());
            System.out.println("is full " +stack.isFull());
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
//        the below code results in stack over flow exception
//        for (int i = 0; i < 8; i++) {
//            try {
//                stack.push("exception");
//            } catch (StackOverFlowException e) {
//                e.printStackTrace();
//            }
//        }

        try {
            System.out.println("peek element " +stack.peek());
            stack.pop();
            System.out.println("peek element " + stack.peek());
            System.out.println(stack);
        } catch (StackUnderflowException e) {
            e.printStackTrace();
        }

    }
}
