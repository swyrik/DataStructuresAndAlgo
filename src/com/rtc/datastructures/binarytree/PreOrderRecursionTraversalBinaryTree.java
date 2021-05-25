package com.rtc.datastructures.binarytree;

public class PreOrderRecursionTraversalBinaryTree {

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
        preOrderRecursionTraversal(nodeA);

    }

    private static <T> void preOrderRecursionTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData()+" -> ");
        preOrderRecursionTraversal(root.getLeftChild());
        preOrderRecursionTraversal(root.getRightChild());

    }

}
