package com.rtc.datastructures.binarytree;

import java.util.Stack;

public class InOrderRecursionTraversalBinaryTree {

    public static void main(String[] args) {

        Node<String> nodeA = new Node<>("Java");
        Node<String> nodeB = new Node<>("JavaScript");
        Node<String> nodeC = new Node<>("Go");
        Node<String> nodeD = new Node<>("C");
        Node<String> nodeE = new Node<>("C++");
        Node<String> nodeF = new Node<>("Python");
        Node<String> nodeG = new Node<>("Ruby");
        Node<String> nodeH = new Node<>("C#");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeC.setLeftChild(nodeD);
        nodeC.setRightChild(nodeG);
        nodeD.setLeftChild(nodeE);
        nodeD.setRightChild(nodeF);
        nodeG.setRightChild(nodeH);
        inOrderRecursionTraversal(nodeA);

    }

    private static <T> void inOrderRecursionTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        inOrderRecursionTraversal(root.getLeftChild());
        System.out.print(root.getData()+" -> ");
        inOrderRecursionTraversal(root.getRightChild());

    }

}
