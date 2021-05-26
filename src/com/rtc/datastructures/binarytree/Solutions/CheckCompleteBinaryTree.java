package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;

public class CheckCompleteBinaryTree {

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
//        nodeB.setRightChild(nodeD);
        nodeB.setLeftChild(nodeE);
        boolean isComplete = isComplete(nodeA, 0, countNumNodes(nodeA));
        System.out.println(isComplete);

    }

    private static boolean isComplete(Node<String> root, int index, int numberNodes) {

        if (root == null)
            return true;

        if (index >= numberNodes)
            return false;

        return (isComplete(root.getLeftChild(), 2 * index + 1, numberNodes)
                && isComplete(root.getRightChild(), 2 * index + 2, numberNodes));
    }

    private static <T> int countNumNodes(Node<T> root) {
        if (root == null)
            return (0);
        return (1 + countNumNodes(root.getLeftChild()) + countNumNodes(root.getRightChild()));
    }


}
