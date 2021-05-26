package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;

public class CheckBalancedBinaryTree {

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
        nodeB.setRightChild(nodeD);
        nodeB.setRightChild(nodeE);
        nodeE.setLeftChild(nodeF);

        boolean isbalanced = isBalanced(nodeA);
        System.out.println(isbalanced);
    }

    private static <T> boolean isBalanced(Node<T> root) {

        if(root == null){
            return true;
        }

        return Math.abs(maxiumDepth(root.getLeftChild()) - maxiumDepth(root.getRightChild())) > 1 ? false : true;

    }

    private static <T> int maxiumDepth(Node<T> root) {
        if(root == null){
            return 0;
        }
        if(root.getLeftChild() == null && root.getRightChild()==null){
            return 0;
        }
        int leftMaxDepth = maxiumDepth(root.getLeftChild());
        int rightMaxDepth = maxiumDepth(root.getRightChild());

        int maxDepth = 1 + Math.max(leftMaxDepth , rightMaxDepth);

        return maxDepth;

    }


}
