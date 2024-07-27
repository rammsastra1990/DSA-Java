package com.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    public void removeLast() {
        if (length == 0) {
            return;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
    }

    public void prepend(int value) {
        if (length == 0)
            return;
        Node temp = head;
        Node newNode = new Node(value);
        head = newNode;
        head.next = temp;

    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(5);
        System.out.println("Linked List before removing: ");
        linkedList.printList();
        linkedList.removeLast();
        linkedList.prepend(1);
        System.out.println("Linked List after removing: ");
        linkedList.printList();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

    }

}