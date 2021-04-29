package com.rtc.datastructures.queue;

public class Element<T> {

    private T data;

    private Element<T> previous;
    private Element<T> next;

    public Element(T data) {
        this.data = data;
        setNext(null);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Element<T> previous) {
        this.previous = previous;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data) + " <-> "+ (null != next? next.toString() : "|");
    }
}
