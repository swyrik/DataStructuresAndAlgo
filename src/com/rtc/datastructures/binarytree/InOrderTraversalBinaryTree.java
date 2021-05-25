package com.rtc.datastructures.binarytree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class InOrderTraversalBinaryTree {

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
        inOrderTraversal(nodeA);

    }

    private static <T> void inOrderTraversal(Node<T> root){
        if(root == null){
            return;
        }

        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();

        stack.add(root);

        while(!stack.isEmpty()){
            Node<T> pop = stack.pop();
            if( null == pop.getLeftChild() && null == pop.getRightChild()){
                System.out.print(pop.getData()+" -> ");
            }else if(visitedNodes.contains(pop)){
                System.out.print(pop.getData()+" -> ");
            }else{
                visitedNodes.add(pop);
                if(null != pop.getRightChild()){
                    stack.push(pop.getRightChild());
                }
                stack.push(pop);
                if(null != pop.getLeftChild()){
                    stack.push(pop.getLeftChild());
                }
            }
        }
    }


}
