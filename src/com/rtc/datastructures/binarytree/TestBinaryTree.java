package com.rtc.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class TestBinaryTree {

    public static void main(String[] args) {
        Node<Character> nodeA = new Node<>('A');
        Node<Character> nodeB = new Node<>('B');
        Node<Character> nodeC = new Node<>('C');
        Node<Character> nodeD = new Node<>('D');
        Node<Character> nodeE = new Node<>('E');
        Node<Character> nodeF = new Node<>('F');
        Node<Character> nodeG = new Node<>('G');
        Node<Character> nodeH = new Node<>('H');

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeC.setLeftChild(nodeD);
        nodeC.setRightChild(nodeG);
        nodeD.setLeftChild(nodeE);
        nodeD.setRightChild(nodeF);
        nodeG.setRightChild(nodeH);

        /*System.out.println(nodeA);
        System.out.println(nodeB);
        System.out.println(nodeC);
        System.out.println(nodeD);
        System.out.println(nodeE);
        System.out.println(nodeF);
        System.out.println(nodeG);
        System.out.println(nodeH);*/


        breadthFirstTraversal(nodeA);
        System.out.println();
        breadthFirstTraversal(nodeC);
        System.out.println();
        breadthFirstTraversal(nodeD);
        System.out.println();
        breadthFirstTraversal(nodeG);

    }

    public static <T> void breadthFirstTraversal(Node<T> root){

        if(root == null){
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node<T> remove = queue.remove();
            System.out.print(remove.getData() + "->");

            if(null != remove.getLeftChild()){
                queue.add(remove.getLeftChild());
            }

            if(null != remove.getRightChild()){
                queue.add(remove.getRightChild());
            }
        }



    }
}
