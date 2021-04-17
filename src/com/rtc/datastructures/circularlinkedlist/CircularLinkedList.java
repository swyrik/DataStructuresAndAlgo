package com.rtc.datastructures.circularlinkedlist;

import com.rtc.datastructures.MyList;

import java.util.List;

public class CircularLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public CircularLinkedList() {

    }

    public void insert(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            tail=node;
            head = node;
            head.setNext(tail);
            tail.setNext(head);
            return;
        }
        node.setNext(head);
        tail.setNext(node);
        tail = node;
    }

    public int countNodes(){
        Node<T> curr = head;
        if(head == null){
            return 0;
        }
        int count = 1;
        while(curr != tail){
            curr = curr.getNext();
            count++;
        }
        return count;
    }

    public void delete(T data){
        Node<T> curr = head;
        Node<T> prev = tail;
        if(head ==null && tail ==null){
            return;
        }
        while(true){

            if(curr.getData().equals(data)){

                if(tail == head){
                    head = null;
                    tail = null;
                    break;
                }

                if(prev == tail){
                    head = head.getNext();
                }

                if(curr == tail){
                    tail =prev;
                }
                prev.setNext(curr.getNext());
                break;
            }

            if(curr == tail){
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }


    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("\n");
       Node<T> curr =head;

       while(curr != tail){
           sb.append(curr.toString() + " -> ");
           curr = curr.getNext();
       }

       if(tail != null){
           sb.append(tail.toString());
       }

       sb.append("\nHead: "+ head + " Tail: "+tail);
       return sb.toString();
    }
}
