package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;
import com.rtc.datastructures.binarytree.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorBinaryTree {

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
        node6.setLeftChild(node8);
        node6.setRightChild(node7);
        breadFirstLevelTraversal(node1);
        mirrorBinaryTree(node1);
        System.out.println();

        breadFirstLevelTraversal(node1);

    }

    private static <T> void mirrorBinaryTree(Node<T> root) {

        if(root == null){
            return;
        }

        if(root.getLeftChild() == null || root.getRightChild() == null){
            return;
        }

        mirrorBinaryTree(root.getRightChild());
        mirrorBinaryTree(root.getLeftChild());

        Node<T> rightChild = root.getRightChild();
        root.setRightChild(root.getLeftChild());
        root.setLeftChild(rightChild);

    }

    private static <T> void breadFirstLevelTraversal(Node<T> root){
        if(null == root){
            return;
        }

        Queue<Pair<Node<T>, Integer>> queue = new LinkedList<>();
        Pair<Node<T>, Integer> pair = new Pair<>(root, 0);
        queue.add(pair);

        while(!queue.isEmpty()){

            Pair<Node<T>, Integer> remove = queue.remove();
            System.out.print(remove.toString()+"->");

            int level = remove.getValue()+1;
            if(null != remove.getKey().getLeftChild()){
                Pair<Node<T>, Integer> leftPair = new Pair<>(remove.getKey().getLeftChild(), level);
                queue.add(leftPair);
            }

            if(null != remove.getKey().getRightChild()){
                Pair<Node<T>, Integer> rightPair = new Pair<>(remove.getKey().getRightChild(), level);
                queue.add(rightPair);
            }

        }

    }
}
