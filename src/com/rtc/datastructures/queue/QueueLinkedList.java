package com.rtc.datastructures.queue;

public class QueueLinkedList<T extends Comparable<T>>   {

    private Element<T> front;
    private Element<T> rear;
    private int size = 0;

    public boolean isEmpty(){
        return size == 0;
    }

    public  boolean isFull(){
        return false;
    }

    public int getSize(){
        return size;
    }

    public QueueLinkedList() {

    }

    @Override
    public String toString() {
        if(front == null){
            return "";
        }
        return front.toString();
    }

    public void enqueue(T data){
        Element<T> node = new Element<>(data);
        if(isEmpty()){
            front = node;
            rear = node;
        }else{
            rear.setNext(node);
            node.setPrevious(rear);
            rear = node;
        }
        size++;
    }
}
