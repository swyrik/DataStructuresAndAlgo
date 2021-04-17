package com.rtc.datastructures;

import java.util.List;

public interface MyList<T extends Comparable<T>> {
    public void insertAtHead(T data);
    public void insertAtTail(T data);
    public void insert(T data, int index);
    public T pop();
    public boolean contains(T data);
    public void delete(T data);
    public List<T> findAllLessThan(T data);
    public int countNodes();
}
