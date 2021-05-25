package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;

public class PathSumBinaryTree  {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node8 = new Node<>(8);

        node1.setLeftChild(node2);
        node1.setRightChild(node3);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);
        node3.setLeftChild(node6);
        node6.setRightChild(node7);
        node6.setLeftChild(node8);
        int currentSum = 18;
        boolean pathSum = hasPathSum(node1, currentSum);
        System.out.println(pathSum);


    }

    private static boolean hasPathSum(Node<Integer> root, int currentSum) {

        if(root == null){
            return false;
        }

        if(root.getLeftChild() == null && root.getLeftChild() == null){
            return currentSum == root.getData();
        }

        boolean leftPathSum = hasPathSum(root.getLeftChild(), currentSum - root.getData());
        boolean rightPathSum = hasPathSum(root.getRightChild(), currentSum - root.getData());

        boolean hasPathSum = leftPathSum || rightPathSum;

        System.out.println(root +
                " leftPathSum: " + leftPathSum +
                " rightPathSum: " + rightPathSum +
                " hasPathSum: " + hasPathSum);

        return hasPathSum;

    }
}
