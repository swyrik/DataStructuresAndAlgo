package com.rtc.datastructures.queue;

import com.rtc.datastructures.stacks.MyStackLinkedList;
import com.rtc.datastructures.stacks.StackUnderflowException;

public class QueueWithStacks<T extends Comparable<T>> {

    private MyStackLinkedList<T> forwardStack;
    private MyStackLinkedList<T> reverseStack;

    public QueueWithStacks() {
        forwardStack = new MyStackLinkedList<>();
        reverseStack = new MyStackLinkedList<>();
    }

    public void enqueue(T data) throws QueueUnderFlowException {
        try{

            if(forwardStack.isEmpty()){
                while(!reverseStack.isEmpty()){
                    forwardStack.push(reverseStack.pop());
                }
            }

            forwardStack.push(data);
        }catch(StackUnderflowException sue){
            throw new QueueUnderFlowException("queue is empty");
        }
    }


    public T dequeue() throws QueueUnderFlowException {
        try{

            if(reverseStack.isEmpty()){
                while(!forwardStack.isEmpty()){
                    reverseStack.push(forwardStack.pop());
                }
            }

            return reverseStack.pop();
        }catch(StackUnderflowException sue){
            throw new QueueUnderFlowException("queue is empty");
        }
    }

    public boolean isEmpty(){
        return forwardStack.isEmpty() && reverseStack.isEmpty();
    }

    public int size(){
        return Math.max(forwardStack.size() , reverseStack.size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nForward stack: " + forwardStack.toString());
        sb.append("\nReverse stack: " + reverseStack.toString());

        return sb.toString();
    }

    public T peek() throws QueueUnderFlowException {
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is empty");
        }

        if(forwardStack.isEmpty()){
            return reverseStack.peek();
        }
        else if(reverseStack.isEmpty()){
            return forwardStack.peek();
        }

        return null;
    }
}
