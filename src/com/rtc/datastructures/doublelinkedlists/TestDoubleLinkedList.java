package com.rtc.datastructures.doublelinkedlists;

import com.rtc.datastructures.linkedlists.MyLinkedList;

public class TestDoubleLinkedList {

    public static void main(String[] args) {
//        MyDoubleLinkedList<Integer> ll = new MyDoubleLinkedList<>();
//        ll.insertAtHead(30);
//        ll.insertAtHead(20);
//        ll.insertAtHead(10);
//        System.out.println(ll);

//        MyDoubleLinkedList<Integer> ll = new MyDoubleLinkedList<>();
//        ll.insertAtTail(30);
//        ll.insertAtTail(20);
//        ll.insertAtTail(10);
//        System.out.println(ll);

//        MyDoubleLinkedList<Integer> myLinkedList = new MyDoubleLinkedList<Integer>();
//        myLinkedList.insertAtTail(50);
//        myLinkedList.insertAtTail(100);
//        myLinkedList.insertAtTail(150);
//        myLinkedList.insertAtTail(200);
//        myLinkedList.insert(125, 2);
//        System.out.println(myLinkedList);
//        myLinkedList.insert(25, -1);
//        System.out.println(myLinkedList);
//        myLinkedList.insert(250, 6);
//        System.out.println(myLinkedList);
//        myLinkedList.insert(37, 1);
//        System.out.println(myLinkedList);

        MyDoubleLinkedList<Integer> myLinkedList = new MyDoubleLinkedList<Integer>();

        myLinkedList.insert(37, 0);
        myLinkedList.insert(38, 1);
        myLinkedList.insert(39, 2);
        myLinkedList.insert(36, -1);
        myLinkedList.insert(35, -1);
        myLinkedList.insert(34, -1);
        myLinkedList.insert(40, 5);

        System.out.println(myLinkedList);

        myLinkedList.pop();
        System.out.println(myLinkedList);

        myLinkedList.delete(40);
        System.out.println(myLinkedList);
        myLinkedList.delete(35);
        System.out.println(myLinkedList);
        myLinkedList.delete(38);
        System.out.println(myLinkedList);
        myLinkedList.printBackward();

    }
}
