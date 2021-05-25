package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;

public class PerfectBinaryTree {

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
        nodeB.setLeftChild(nodeD);
        nodeB.setRightChild(nodeG);
        nodeC.setLeftChild(nodeE);
        nodeC.setRightChild(nodeF);
        int currentLevel = 0;

        boolean isPerfect = isPerfect(nodeA);
        System.out.println(isPerfect);
    }

    private static boolean isPerfect(Node<String> nodeA) {
        int height = heightOfTree(nodeA);
        return isPerfectRecursive(nodeA, height, 0);
    }

    private static <T> int heightOfTree(Node<T> root) {

        int height = 0;
        Node<T> node = root;
        while (node != null){
            height++;
            node = node.getLeftChild();
        }
        return height -1;
    }

    private static <T> boolean isPerfectRecursive(Node<T> root, int height, int currentLevel) {

        if(root == null){
            return false;
        }

        if(null == root.getLeftChild() && null == root.getRightChild()){
            return height == currentLevel;
        }

        if(root.getLeftChild() != null  && root.getLeftChild() != null){
            currentLevel++;
            return isPerfectRecursive(root.getRightChild(), height, currentLevel) && isPerfectRecursive(root.getLeftChild(), height, currentLevel);
        }

        return false;
    }
}
