package com.rtc.datastructures.doublelinkedlists;

import com.rtc.datastructures.MyList;

import java.util.LinkedList;
import java.util.List;

public class MyDoubleLinkedList<T extends Comparable<T>> implements MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public int getLength() {
        return length;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    @Override
    public void insertAtHead(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.setNext(head);
        head.setPrevious(node);
        head = node;

        length++;
    }

    @Override
    public void insertAtTail(T data) {
        Node<T> node = new Node<>(data);
        if (null == tail) {
            head = node;
            tail = node;
            return;
        }

        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;

        length++;
    }

    @Override
    public void insert(T data, int index) {
        Node<T> node = new Node<>(data);

        if (length - index > length / 2) {
            if (index <= 0) {
                insertAtHead(data);
                return;
            }
            Node<T> curr = head;
            int currIndex = 1;
            while (curr != null && currIndex < index) {
                curr = curr.getNext();
                currIndex++;
            }
            node.setNext(curr.getNext());
            curr.setNext(node);

        } else {
            if (index >= length) {
                insertAtTail(data);
                return;
            }

            int currIndex = length;
            Node<T> curr = tail;

            while (curr != null && currIndex > index) {
                curr = curr.getPrevious();
                currIndex--;
            }
            node.setNext(curr.getNext());
            curr.setNext(node);
        }
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        T data = head.getData();
        head = head.getNext();
        head.setPrevious(null);
        length--;
        return data;
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public void delete(T data) {

        Node<T> curr = head;
        while (curr != null) {
            if (curr.getData().equals(data)) {
                Node<T> next = curr.getNext();
                Node<T> prev = curr.getPrevious();
                if (prev == null) {
                    pop();

                } else {
                    prev.setNext(next);
                    if (next != null) {
                        next.setPrevious(prev);
                    }else{
                        tail = prev;
                    }
                    length--;
                }

                break;

            }
            curr = curr.getNext();
        }

    }

    public void printBackward(){
        Node<T> node = tail;
        if(tail == null){
            System.out.println("No elements in the double linked list");
            return;
        }
        while(tail != null){
            System.out.print(tail.getData()+" <-> ");
            tail = tail.getPrevious();
        }
        System.out.print("null");

    }

    @Override
    public List<T> findAllLessThan(T data) {
        return null;
    }

    @Override
    public int countNodes() {
        return 0;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        return head.toString();
    }
}
