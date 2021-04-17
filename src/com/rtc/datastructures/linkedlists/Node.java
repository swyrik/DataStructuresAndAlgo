package com.rtc.datastructures.linkedlists;

public class Node<T extends  Comparable<T>> {

    private T Data;
    private Node<T> next;

    public Node(T data){
        this.Data = data;
        setNext(null);
    }

    public T getData() {
        return Data;
    }

    public void setNext(Node<T> data) {
        this.next = data;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return String.valueOf(Data) + " -> " + (next == null? "null" : next.toString());
    }
}
