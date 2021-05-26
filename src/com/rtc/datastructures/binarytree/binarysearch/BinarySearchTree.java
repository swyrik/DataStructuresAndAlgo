package com.rtc.datastructures.binarytree.binarysearch;

import com.rtc.datastructures.binarytree.Node;
import com.rtc.datastructures.binarytree.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public static void main(String[] args) {
        Node<Integer> nodeA = new Node<>(8);
        insert(nodeA, 3);
        insert(nodeA, 10);
        breadFirstLevelTraversal(nodeA);

        insert(nodeA, 2);
        insert(nodeA, 7);
        insert(nodeA, 0);
        insert(nodeA, 12);
        System.out.println();
        breadFirstLevelTraversal(nodeA);
        System.out.println();
        Node<Integer> node = lookup(nodeA, 12);
        System.out.println(node);
        Node<Integer> node2 = lookup(nodeA, 0);
        System.out.println(node2);
        Node<Integer> node3 = lookup(nodeA, 37);
        System.out.println(node3);

        System.out.println("mimimum value: "+minimumVal(nodeA));
        System.out.println("maximum value: "+maximumVal(nodeA));

        insert(nodeA, -9);
        insert(nodeA, 82);

        System.out.println("mimimum value: "+minimumVal(nodeA));
        System.out.println("maximum value: "+maximumVal(nodeA));

        printRange(nodeA, -9,10);

        Node<String> mNode1 = new Node<>("ironman");
        insert(mNode1,"captian america");
        insert(mNode1,"black panther");
        insert(mNode1,"doctor strange");
        insert(mNode1,"spider man");
        insert(mNode1,"hulk");
        insert(mNode1,"black widow");
        insert(mNode1,"ant man");
        insert(mNode1,"marvel");

        breadFirstLevelTraversal(mNode1);
        System.out.println();
        System.out.println("mimimum value: "+minimumVal(mNode1));
        System.out.println("maximum value: "+maximumVal(mNode1));

        printRange(mNode1, "d","s");
        System.out.println();

        System.out.println("mnode1 is a binary tree: "+isBinaryTreeCheck(mNode1));

        Node<String> nodeA1 = new Node<>("Java");
        Node<String> nodeB1 = new Node<>("JavaScript");
        Node<String> nodeC1 = new Node<>("Go");
        Node<String> nodeD1 = new Node<>("C");
        Node<String> nodeE1 = new Node<>("C++");
        Node<String> nodeF1 = new Node<>("Python");
        Node<String> nodeG1 = new Node<>("Ruby");
        Node<String> nodeH1 = new Node<>("C#");

        nodeA1.setLeftChild(nodeB1);
        nodeA1.setRightChild(nodeC1);
        nodeC1.setLeftChild(nodeD1);
        nodeC1.setRightChild(nodeG1);
        nodeD1.setLeftChild(nodeE1);
        nodeD1.setRightChild(nodeF1);
        nodeG1.setRightChild(nodeH1);

        System.out.println("nodeA1 is a binary tree: "+isBinaryTreeCheck(nodeA1));
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

    private static <T extends Comparable<T>> Node<T> insert(Node<T> root, T data){
        if(root == null){
            return new Node<T>(data);
        }

        if(data.compareTo(root.getData())<=0){
          root.setLeftChild(insert(root.getLeftChild(), data));
        }else{
            root.setRightChild(insert(root.getRightChild(), data));
        }

        return root;
    }

    private static <T extends Comparable> Node<T> lookup(Node<T> root, T data){
        if(root == null){
            return null;
        }

        if(root.getData().compareTo(data) == 0){
            return root;
        }else if(root.getData().compareTo(data) > 0){
            System.out.println("looking to into left child,  current root: " + root.getData());
            return lookup(root.getLeftChild(), data);
        }else{
            System.out.println("looking to into right child,  current root: " + root.getData());
            return lookup(root.getRightChild(), data);
        }

    }

    private static <T extends Comparable> T minimumVal(Node<T> root){
        T data = null;
        while(root != null){
            data = root.getData();
            root = root.getLeftChild();
        }
        return data;
    }

    private static <T extends Comparable> T maximumVal(Node<T> root){
        T data = null;
        while(root != null){
            data = root.getData();
            root = root.getRightChild();
        }
        return data;
    }

    private static <T extends Comparable> void printRange(Node<T> root, T low, T high){
        if(root == null){
            return ;
        }

        if(low.compareTo(root.getData()) <= 0){
            printRange(root.getLeftChild(), low, high);
        }

        if(low.compareTo(root.getData()) <= 0 && high.compareTo(root.getData()) >= 0){
            System.out.print(root.getData() +" ");
        }

        if(high.compareTo(root.getData()) > 0){
            printRange(root.getRightChild(), low, high);
        }

    }

    private static <T extends Comparable> boolean isBinaryTreeCheck(Node<T> root){
        if(root == null){
            return true;
        }

        if(root.getLeftChild() != null){
            if(root.getData().compareTo(root.getLeftChild().getData()) <= 0){
                return false;
            }
        }

        if(root.getRightChild() != null){
            if(root.getData().compareTo(root.getRightChild().getData()) > 0){
                return false;
            }
        }

        return isBinaryTreeCheck(root.getLeftChild()) && isBinaryTreeCheck(root.getRightChild());

    }



}
