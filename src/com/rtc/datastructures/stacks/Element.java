package com.rtc.datastructures.stacks;

public class Element<T extends Comparable<T>> {

    private T data;
    private Element<T> next;

    public T getData() {
        return data;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public Element(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data) + " -> " + (next != null ? next.toString() : "");
    }
}
