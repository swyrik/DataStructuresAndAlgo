package com.rtc.datastructures.queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue<T> {

    private static final int MAX_SIZE = 10;

    private T[] array;

    private int frontIndex = -1;
    private int rearIndex = -1;

    public Queue(Class<T> clazz){
        array = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public boolean isEmpty(){
        return frontIndex == -1 && rearIndex == -1;
    }

    public boolean isFull(){
        return frontIndex == 0 && rearIndex == MAX_SIZE-1;
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return rearIndex - frontIndex+1;
    }

    public void enqueue(T data) throws QueueOverFlowException{
        if(isEmpty()){
            array[++rearIndex] = data;
            frontIndex = rearIndex;
        }else{
            if(isFull()){
                throw new QueueOverFlowException("queue is full");
            }else{
                if(rearIndex == MAX_SIZE -1){
                    int copyIndex = 0;
                    for (int i = frontIndex; i <= rearIndex; i++) {
                        array[copyIndex] = array[i];
                        copyIndex++;
                    }
                    array[copyIndex] = data;
                    frontIndex = 0;
                    rearIndex = copyIndex;
                }else{
                    array[++rearIndex] = data;
                }
            }
        }
    }

    public T dequeue() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is empty");
        }else{
            T dequeuData = array[frontIndex];
            frontIndex = frontIndex+1;
            return dequeuData;
        }
    }

    public T peek() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException("queue is empty");
        }else{
            return array[frontIndex];
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(Arrays.toString(array));
        sb.append("\nFront: "+ frontIndex +" Rear: "+rearIndex);
        return sb.toString();
    }
}
