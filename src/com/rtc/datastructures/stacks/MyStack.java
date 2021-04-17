package com.rtc.datastructures.stacks;

import java.util.Arrays;

public class MyStack<T extends Comparable<T>>  {

    private static final int MAX_SIZE=10;
    private int topIndex = -1;
    private Object[] arr;

    public MyStack(){
        arr = new Object[MAX_SIZE];
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

    public int size(){
        return topIndex + 1;
    }

    public boolean isFull(){
        return topIndex == MAX_SIZE - 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public void push (T element) throws StackOverFlowException{
        if(topIndex == MAX_SIZE -1){
            throw new StackOverFlowException("Stack is totally occupied");
        }
        arr[++topIndex] = element;
    }

    public T pop() throws StackUnderflowException{
        if(isEmpty()){
            throw new StackUnderflowException("Stack is empty");
        }
        T element  = (T) arr[topIndex--];
        return element;

    }

    public T peek() throws StackUnderflowException {
        if(isEmpty()){
            throw  new StackUnderflowException("Stack is empty");
        }
        return (T) arr[topIndex];
    }
}
