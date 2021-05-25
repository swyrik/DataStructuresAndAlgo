package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;

public class CountNodesBinaryTree {

    public static void main(String[] args) {
        Node<String> nodeA = new Node<>("Java");
        Node<String> nodeB = new Node<>("JavaScript");
        Node<String> nodeC = new Node<>("Go");
        Node<String> nodeD = new Node<>("C");
        Node<String> nodeE = new Node<>("C++");
        Node<String> nodeF = new Node<>("Python");
        Node<String> nodeG = new Node<>("Ruby");
//        Node<String> nodeH = new Node<>("C#");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeC.setLeftChild(nodeD);
        nodeC.setRightChild(nodeG);
        nodeD.setLeftChild(nodeE);
        nodeD.setRightChild(nodeF);
//        nodeG.setRightChild(nodeH);
        int count = countNodes(nodeA);
        System.out.println(count);

    }

    private static <T> int countNodes(Node<T> nodeA) {

        if(null == nodeA){
            return 0;
        }

        return 1 + countNodes(nodeA.getLeftChild()) + countNodes(nodeA.getRightChild());

    }


}
