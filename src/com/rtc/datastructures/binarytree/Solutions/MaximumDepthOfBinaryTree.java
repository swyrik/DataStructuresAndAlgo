package com.rtc.datastructures.binarytree.Solutions;

import com.rtc.datastructures.binarytree.Node;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        Node<String> nodeA = new Node<>("Java");
        Node<String> nodeB = new Node<>("JavaScript");
        Node<String> nodeC = new Node<>("Go");
        Node<String> nodeD = new Node<>("C");
        Node<String> nodeE = new Node<>("C++");
        Node<String> nodeF = new Node<>("Python");
        Node<String> nodeG = new Node<>("Ruby");
        Node<String> nodeH = new Node<>("C#");
        Node<String> nodeI = new Node<>("Fortran");
        Node<String> nodeJ = new Node<>("Erlang");
        Node<String> nodeK = new Node<>("Perl");
        Node<String> nodeL = new Node<>("Kotlin");
        Node<String> nodeM = new Node<>("ObjectiveC");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeC.setLeftChild(nodeD);
        nodeC.setRightChild(nodeG);
        nodeD.setLeftChild(nodeE);
        nodeD.setRightChild(nodeF);
        nodeG.setRightChild(nodeH);
        nodeH.setRightChild(nodeI);
        nodeB.setLeftChild(nodeJ);
        nodeJ.setLeftChild(nodeK);
        nodeK.setLeftChild(nodeL);
        nodeL.setLeftChild(nodeM);
        int maxDepth = maxiumDepth(nodeA);
        System.out.println(maxDepth);
    }

    private static int maxiumDepth(Node<String> root) {
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
