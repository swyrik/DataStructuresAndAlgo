package com.rtc.datastructures.queue;

public class QueueUnderFlowException extends Exception{

    private static final long serialVersionUID = 1l;

    public QueueUnderFlowException(String message) {
        super(message);
    }
}
