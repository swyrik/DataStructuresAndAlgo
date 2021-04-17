package com.rtc.datastructures.stacks;

import com.rtc.datastructures.doublelinkedlists.Node;

public class MyStackLinkedList<T extends Comparable<T>> {

    private Element<T> head;
    private int size;

    public void push(T data){
        Element<T> element = new Element<>(data);
        element.setNext(head);
        head = element;
        size++;
    }

    public T peek(){
        if(size != 0){
            return head.getData();
        }
        return null;
    }

    public T pop() throws StackUnderflowException{
        if(size != 0){
            Element<T> pop = head;
            head = head.getNext();
            size--;
            return pop.getData();
        }else{
            throw new StackUnderflowException("Stack is empty");
        }
    }

    @Override
    public String toString() {
        return head.toString();
    }
}
