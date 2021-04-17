package com.rtc.datastructures.linkedlists;

import com.rtc.datastructures.MyList;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {

    private Node<T> head;
    private int length;

    public MyLinkedList(){

    }

    @Override
    public void insertAtHead(T data){

        Node<T> node = new Node<>(data);
        if(head != null){
            length++;
            node.setNext(head);
        }

        head = node;

    }
    @Override
    public void insertAtTail(T data){
        Node<T> node = new Node<>(data);

        Node<T> curr = head;
        if(head == null){
            insertAtHead(data);
            return;
        }

        while(curr.getNext() !=null){
            curr = curr.getNext();
        }
        curr.setNext(node);
        length++;
    }
    @Override
    public void insert(T data, int index){
        if(index <= 0){
            insertAtHead(data);
            return;
        }
        if(index == length){
            insertAtTail(data);
            return;
        }

        Node<T> curr = head;
        int currIndex = 1;
        while(curr.getNext() != null && currIndex < index){
            curr = curr.getNext();
            currIndex++;
        }
        Node<T> node = new Node<>(data);
        Node<T> nextNode = curr.getNext();
        curr.setNext(node);
        node.setNext(nextNode);
        length++;


    }
    @Override
    public T pop(){
        if(head == null){
            return null;
        }
        Node<T> first = head;
        head = head.getNext();
        length--;
        return first.getData();

    }
    @Override
    public boolean contains(T data){
        Node<T> curr = head;
        while (curr != null){
            if(curr.getData().equals(data)){
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }
    @Override
    public void delete(T data){
        Node<T> curr = head;
        Node<T> prev = null;
        while(curr != null){
            if(curr.getData().equals(data)){
                if(prev == null){
                    head = head.getNext();

                }else{
                    prev.setNext(curr.getNext());

                }
                length--;
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }
    @Override
    public List<T> findAllLessThan(T data){
        Node<T> curr = head;
        List<T> list = new ArrayList<>();
        while (curr != null){
            if(curr.getData().compareTo(data)<0){
                list.add(curr.getData());
            }
            curr = curr.getNext();
        }
        return list;
    }
    @Override
    public int countNodes(){
        Node<T> curr = head;
        int count = 0;
        while(curr != null){
            count ++;
            curr = curr.getNext();
        }
        return count;
    }

    @Override
    public String toString() {
        if(head == null){
            return "";
        }
        return head.toString();
    }
}
