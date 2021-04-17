package com.rtc.datastructures.circularlinkedlist;

public class TestCircularLinkedList {

    public static void main(String[] args) {
//        CircularLinkedList<Integer> cc = new CircularLinkedList<>();
//        cc.insert(6);
//        System.out.println(cc.countNodes());
//        cc.insert(2);
//        System.out.println(cc.countNodes());
//        cc.insert(3);
//        cc.insert(9);
//        System.out.println(cc.countNodes());
//        cc.insert(5);
//        System.out.println(cc);


        CircularLinkedList<Integer> cc = new CircularLinkedList<>();
        cc.insert(6);
        cc.insert(2);
        cc.insert(3);
        cc.insert(9);
        cc.insert(5);
        System.out.println(cc);
        cc.delete(6);
        System.out.println(cc);
        cc.delete(5);
        System.out.println(cc);
        cc.delete(3);
        System.out.println(cc);


    }
}
