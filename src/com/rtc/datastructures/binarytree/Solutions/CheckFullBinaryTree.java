package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;

public class CheckFullBinaryTree {

    public static void main(String[] args) {
        Node<String> nodeA = new Node<>("Alice");
        Node<String> nodeB = new Node<>("Bucky");
        Node<String> nodeC = new Node<>("Cat");
        Node<String> nodeD = new Node<>("Donald");
        Node<String> nodeE = new Node<>("Ethan");
        Node<String> nodeF = new Node<>("Freddy");
        Node<String> nodeG = new Node<>("George");
        Node<String> nodeH = new Node<>("Hiller");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeC.setLeftChild(nodeD);
        nodeC.setRightChild(nodeG);
        nodeD.setLeftChild(nodeE);
        nodeD.setRightChild(nodeF);
        boolean isFull = isFull(nodeA);
        System.out.println(isFull);
    }

    private static <T> boolean isFull(Node<T> root) {
        if(root == null){
            return false;
        }

        if(root.getRightChild() == null && root.getLeftChild() == null){
            return true;
        }

        if(root.getLeftChild() != null && root.getLeftChild() != null){
            return isFull(root.getRightChild()) && isFull(root.getLeftChild());
        }

        return false;
    }


}
