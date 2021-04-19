package com.rtc.datastructures.stacks;

import java.util.Stack;

public class MinimumElement {

    public static void main(String[] args) {
        int arr[] = {99,4,22,3,66,22,11,3};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(integerStack.isEmpty()){
                integerStack.push(arr[i]);
            }else {
                if(arr[i] < integerStack.peek()){
                    integerStack.pop();
                    integerStack.push(arr[i]);
                }
            }

        }
        System.out.println(integerStack.peek());
    }
}
