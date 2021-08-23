package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest {

    @Test

    public void LinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.insert(40, 2);
        myLinkedList.printMyNodes();
        myLinkedList.delete(2);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        System.out.println(result);
        Assert.assertTrue(result);
    }
}
