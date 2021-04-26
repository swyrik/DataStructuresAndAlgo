package com.rtc.datastructures.queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CircularQueue<T> {

    private int frontIndex = -1;
    private int rearIndex = -1;

    private T[] array;

    private static final int MAX_SIZE = 10;

    public CircularQueue(Class<T> clazz) {
        array = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public boolean isEmpty(){
        return frontIndex == -1 && rearIndex == -1;
    }

    public boolean isFull(){
        int nextIndex = (rearIndex+1) % array.length;
        return frontIndex == nextIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(Arrays.toString(array));
        sb.append("\nfront: "+frontIndex+ " rear: "+rearIndex);
        return sb.toString();
    }

    public void enqueue(T data) throws QueueOverFlowException{
        if(isFull()){
            throw new QueueOverFlowException("circular queue is full");
        }else{
            rearIndex = (rearIndex+1) % array.length;
            array[rearIndex] = data;
            if(frontIndex == -1){
                frontIndex = rearIndex;
            }
        }
    }

    public T dequeue() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException("queue is empty");
        }else{
            T data = array[frontIndex];
            if(frontIndex == rearIndex){
                frontIndex = -1;
                rearIndex = -1;
            }else {
                frontIndex = (frontIndex+1)% array.length;
            }
            return data;
        }
    }

    public T peek() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is empty");
        }else{
            return array[frontIndex];
        }
    }
}
