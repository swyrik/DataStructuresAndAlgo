package com.rtc.datastructures.circularlinkedlist;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node next;

    public T getData() {
        return data;
    }

    public Node(T data) {
        this.data = data;
        setNext(null);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
