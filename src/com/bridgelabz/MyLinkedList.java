package com.bridgelabz;

import org.w3c.dom.Node;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    /* This method is used to insert the element in between two nodes */
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /* This method is used for deleting the first node */
    public void popFirst() {
        if(head !=null)
            this.head = head.getNext();
    }

    /* Method is used for deleting the last node */
    public void popLast() {
        INode tempNode = head;
        while (tempNode.getNext() != (tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode.setNext(null);
    }
    /* Method to get the position of an element*/
    public void searchElement() {
        if (head == null)
            System.out.println("Linked List is empty");
        else {
            INode tempNode = head;
            int position = 0;
            while (tempNode != null) {
                position++;
                if (tempNode.getKey().equals(30)) {
                    System.out.println("Key value 30 is present at position " + position + " in list");
                }
                tempNode = tempNode.getNext();
            }
        }
    }
    /* This method is used for inserting a new key value at particular position  */
    public void insert(int key, int position) {
        MyNode newNode = new MyNode(key);
        MyNode nodeAtCurrentIndex = (MyNode) head;

        int index=0;
        while(index < position - 1) {
            nodeAtCurrentIndex = (MyNode) nodeAtCurrentIndex.next;
            index++;
        }
        newNode.next = nodeAtCurrentIndex.next;
        nodeAtCurrentIndex.next = newNode;
        System.out.println("The node with key values 30 is at position" + position + " ");
    }

    /* This method is used for deleting a key at particular position*/
    public void delete(int position){
        MyNode previousNode = (MyNode) head;
        MyNode currentNode = (MyNode) head;
        for (int i = 0; i < position; i++) {
            previousNode = currentNode;
            currentNode = (MyNode) currentNode.next;
        }
        previousNode.next = currentNode.next;
    }

    public void printMyNodes() {
        StringBuilder myNodes = new StringBuilder("My Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}