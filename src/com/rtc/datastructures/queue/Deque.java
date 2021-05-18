package com.rtc.datastructures.queue;

public class Deque<T> {

    private Element<T> rear;
    private Element<T> front;

    private int size = 0;

    public Deque(){}

    public void addFirst(T data){
        Element<T> node = new Element<>(data);

        if(front==null){
            front = node;
            rear = node;
            return;
        }

        node.setNext(front);
        front.setPrevious(node);

        front = node;
        size++;
    }

    public void addLast(T data){
        Element<T> node = new Element<>(data);

        if(rear == null){
            rear = node;
            front = node;
            return;
        }

        rear.setNext(node);
        node.setPrevious(rear);
        rear = node;
        size++;

    }

    public T removeFirst() throws QueueUnderFlowException {

        if(front == null){
            throw new QueueUnderFlowException("Queue is empty");
        }

        T data = front.getData();

        if(front == rear){
            front = null;
            rear = null;
        }else{
            front = front.getNext();
            front.setPrevious(null);
        }
        size --;
        return data;
    }

    public T removeLast() throws QueueUnderFlowException{
        if(rear == null){
            throw new QueueUnderFlowException("Queue is empty");
        }
        T data = rear.getData();
        if(front == rear){
            front = null;
            rear = null;
        }else{
            rear = rear.getPrevious();
            rear.setNext(null);
        }
        size--;
        return data;
    }

    public T peekFirst() throws QueueUnderFlowException {
        if(front == null){
            throw new QueueUnderFlowException("Queue is empty");
        }
        return front.getData();
    }

    public T peekLast() throws QueueUnderFlowException {
        if(rear == null){
            throw new QueueUnderFlowException("Queue is empty");
        }
        return rear.getData();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return false;
    }

    public int size(){
        return size+1;
    }

    public String toString(){
        if(front == null){
            return "";
        }
        return front.toString();
    }

}
