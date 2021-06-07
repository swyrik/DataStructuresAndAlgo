package com.rtc.datastructures.binaryheap;

import java.lang.reflect.Array;

public abstract class Heap<T extends Comparable> {

    private static int MAX_SIZE = 10;

    private int count = 0;

    private T[] array;

    public int getCount() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return MAX_SIZE == count;
    }

    public T getELementAtIndex(int index) {
        return array[index];
    }

    public Heap(Class<T> clazz) {
        this.array = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public int leftChildIndex(int parentIndex){
        if(parentIndex < 0){
            return -1;
        }

        int leftChildIndex = 2*parentIndex + 1;
        if(leftChildIndex >= count){
            return -1;
        }

        return leftChildIndex;
    }

    public int rightChildIndex(int parentIndex){

        if(parentIndex < 0){
            return -1;
        }

        int rightChildIndex = 2*parentIndex + 2;
        if(rightChildIndex >= count){
            return -1;
        }
        return rightChildIndex;
    }

    public int getParentIndex(int childIndex){
        if(childIndex <= 0 || childIndex>=count){
            return -1;
        }
        return (childIndex - 1)/2;
    }

    protected void swap(int index1, int index2){
        T data = array[index1];
        array[index1] = array[index2];
        array[index2] = data;
    }

    // the implementations depends on max heap and min heap
    // so they are abstract methods

    protected abstract void siftDown(int index);

    protected abstract void siftUp(int index);
}
