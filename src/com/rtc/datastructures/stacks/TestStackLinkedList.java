package com.rtc.datastructures.stacks;

public class TestStackLinkedList {

    public static void main(String[] args) {
        MyStackLinkedList<String> stack = new MyStackLinkedList<>();
        stack.push("Java");
        stack.push("Kotlin");
        stack.push("Python");
        stack.push("Go");
        System.out.println(stack);
        System.out.println("Peek : "+stack.peek());
        stack.push("C++");
        System.out.println("Peek : "+stack.peek());
        System.out.println(stack);
//        stack.pop();
//        stack.pop();
        System.out.println(stack);
        System.out.println("Peek : "+stack.peek());
    }
}
