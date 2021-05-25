package com.rtc.datastructures.binarytree;

import com.rtc.datastructures.binarytree.Node;
import com.rtc.datastructures.binarytree.Pair;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class TestBinaryTreePair {

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
        nodeG.setRightChild(nodeH);
        breadFirstLevelTraversal(nodeA);

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
