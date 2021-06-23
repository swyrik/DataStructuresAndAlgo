package com.rtc.leetcode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(5);
        node.next.next = new ListNode(8);
        System.out.println(node);
        ListNode mainNode = reverseListNode(node);
        System.out.println(mainNode);
    }

    private static ListNode reverseListNode(ListNode node) {
        ListNode next =  null;
        ListNode prev = null;
        while (node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;

        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return  this.val + "->" + (this.next != null ? this.next.toString() : null) ;
    }
}
