package com.bridgelabz;

public class MyNode<K> implements INode<K> {

    public K key;
    public INode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    @Override
    public void setkey(K Key) {
        this.key = key;
    }

    public INode <K>getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}

