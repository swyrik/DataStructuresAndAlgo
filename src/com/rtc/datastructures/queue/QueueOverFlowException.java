package com.rtc.datastructures.queue;

public class QueueOverFlowException extends Exception{

    private static final long serialVersionUId = 1l;

    public QueueOverFlowException(String message) {
        super(message);
    }
}
