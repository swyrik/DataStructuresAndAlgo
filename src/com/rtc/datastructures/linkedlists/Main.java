package com.rtc.datastructures.linkedlists;

public class Main {

    public static void main(String[] args) {
//        Node<Integer> intNode = new Node<>(100);
//        Node<String> strNode = new Node<>("Java");
//
//        System.out.println(intNode);
//        System.out.println(strNode);
//
//        Node<Integer> intNode2 = new Node<>(1000);
//        Node<String> strNode2 = new Node<>("Python");
//
//        System.out.println(intNode2);
//        System.out.println(strNode2);
//
//        intNode.setNext(intNode2);
//        strNode.setNext(strNode2);
//
//        System.out.println(intNode);
//        System.out.println(strNode);
//
//        Node<Integer> intNode3 = new Node<>(10000);
//        Node<String> strNode3 = new Node<>("Go");
//
//        intNode2.setNext(intNode3);
//        strNode2.setNext(strNode3);
//
//        System.out.println(intNode);
//        System.out.println(strNode);

//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
//        myLinkedList.insertAtHead(50);
//        myLinkedList.insertAtHead(100);
//        myLinkedList.insertAtHead(150);
//        myLinkedList.insertAtHead(200);
//        System.out.println(myLinkedList);
//        System.out.println("Length of myLinkedList " + myLinkedList.countNodes());

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.insertAtTail(50);
        myLinkedList.insertAtTail(100);
        myLinkedList.insertAtTail(150);
        myLinkedList.insertAtTail(200);
        myLinkedList.insert(125, 2);
        myLinkedList.insert(25, -1);
        myLinkedList.insert(250, 6);
        System.out.println(myLinkedList);
        myLinkedList.pop();
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.contains(100) + " " + myLinkedList.contains(22));
        myLinkedList.delete(150);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.findAllLessThan(201));
        System.out.println("Length of myLinkedList " + myLinkedList.countNodes());
    }

}
