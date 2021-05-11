package com.rtc.datastructures.queue;

import com.sun.xml.internal.ws.util.xml.CDATA;

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

    public T dequeue() throws QueueUnderFlowException {

        if(isEmpty()){
            throw new QueueUnderFlowException("queue is empty");
        }else{
            T data = front.getData();
            if(front == rear){
                front = null;
                rear = null;
            }else{
                front = front.getNext();
                front.setPrevious(null);

            }
            size--;
            return data;
        }
    }

    public T peek() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException("queue is empty");
        }

        return front.getData();
    }
}
