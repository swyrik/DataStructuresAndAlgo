package com.rtc.datastructures.extra;

import com.rtc.datastructures.binarytree.Node;

import java.nio.charset.CharsetEncoder;
import java.util.LinkedList;
import java.util.List;

public class PrintLeftViewBinaryTree {

    public static void main(String[] args) {
        Node<Character> nodea = new Node<>('a');
        Node<Character> nodeb = new Node<>('b');
        Node<Character> nodec = new Node<>('c');
        Node<Character> noded = new Node<>('d');
        Node<Character> nodee = new Node<>('e');
        Node<Character> nodef = new Node<>('f');
        Node<Character> nodeg = new Node<>('g');
        Node<Character> nodeh = new Node<>('h');
        Node<Character> nodei = new Node<>('i');
        Node<Character> nodej = new Node<>('j');
        Node<Character> nodek = new Node<>('k');

        nodea.setLeftChild(nodeb);
        nodea.setRightChild(nodeh);
        nodeb.setLeftChild(nodec);
        nodeb.setRightChild(nodee);
        nodec.setLeftChild(noded);
        nodee.setRightChild(nodeg);
        nodeh.setLeftChild(nodei);
        nodeh.setRightChild(nodej);
        nodej.setRightChild(nodek);
        List<Character> result = new LinkedList<>();
        result.add(nodea.getData());
        printLeftView(nodea, result);
        for(Character res: result){
            System.out.print(res + "   ");
        }
        System.out.println();

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

        List<String> resultLangLeft = new LinkedList<>();
        resultLangLeft.add(nodeA.getData());
        printLeftView(nodeA, resultLangLeft);
        for(String res: resultLangLeft){
            System.out.print(res+ " ");
        }
        System.out.println();
        List<String> resultLangRight = new LinkedList<>();
        resultLangRight.add(nodeA.getData());
        printRightView(nodeA, resultLangRight);
        for(String res: resultLangRight){
            System.out.print(res+" ");
        }
        System.out.println();

        printOutLine(resultLangLeft, resultLangRight);


        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node8 = new Node<>(8);

        node1.setLeftChild(node2);
        node1.setRightChild(node3);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);
        node3.setLeftChild(node7);
        node3.setRightChild(node8);

        List<Integer> resultLangLeftNum = new LinkedList<>();
        resultLangLeftNum.add(node1.getData());
        printLeftView(node1, resultLangLeftNum);

        List<Integer> resultLangRightNmum = new LinkedList<>();
        resultLangRightNmum.add(node1.getData());
        printRightView(node1, resultLangRightNmum);

        printOutLine(resultLangLeftNum, resultLangRightNmum);




    }

    private static <T> void printOutLine(List<T> resultLangLeft, List<T> resultLangRight) {

        System.out.println("outline");
        for(int i=resultLangLeft.size()-1;i>0;i--){
            System.out.print(resultLangLeft.get(i) +" ");
        }
        for(int j=0;j<resultLangRight.size();j++){
            System.out.print(resultLangRight.get(j)+" ");
        }


    }

    private static <T> void printLeftView(Node<T> nodea, List<T> result) {

        if(nodea == null){
            return;
        }
        if(null != nodea.getLeftChild()){
            result.add((T) nodea.getLeftChild().getData());
            printLeftView(nodea.getLeftChild(),result);
        }else if(null != nodea.getRightChild()){
            result.add((T) nodea.getRightChild().getData());
            printLeftView(nodea.getRightChild(),result);
        }

    }

    private static <T> void printRightView(Node<T> nodea, List<T> result) {

        if(nodea == null){
            return;
        }
        if(null != nodea.getRightChild()){
            result.add((T) nodea.getRightChild().getData());
            printRightView(nodea.getRightChild(),result);
        }else if(null != nodea.getLeftChild()){
            result.add((T) nodea.getLeftChild().getData());
            printRightView(nodea.getLeftChild(),result);
        }

    }

}
