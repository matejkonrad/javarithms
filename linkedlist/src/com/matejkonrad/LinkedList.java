package com.matejkonrad;

public class LinkedList<T> {
    private Node<T> head;

    public void pushBack(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void pushFront(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public T valueAt(int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("Head is null");
        }
        Node<T> currentNode = head;
        int searchIndex = 0;
        while (currentNode.next != null && searchIndex < index) {
            currentNode = currentNode.next;
            searchIndex++;
        }
        if (index > searchIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return currentNode.data;
    }

    public boolean empty() {
        return head == null;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node<T> currentNode = head;
        int searchIndex = 1;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            searchIndex++;
        }
        return searchIndex;
    }

    public T popFront() {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("Head is null");
        }
        T poppedData = head.data;
        if (head.next != null) {
            this.head = head.next;
        } else {
            this.head = null;
        }
        return poppedData;
    }

    public T popBack() {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("Head is null");
        }
        Node<T> currentNode = head;
        Node<T> newLastNode = null;
        while (currentNode.next != null) {
            if (currentNode.next != null && currentNode.next.next == null) {
                newLastNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        T poppedData = currentNode.data;
        if (newLastNode != null) {
            newLastNode.next = null;
        }

        return poppedData;
    }

    public T front() {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("Head is null");
        }

        return head.data;
    }

    public T back() {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("Head is null");
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public void insert(int index, T value) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("Head is null");
        }
        int searchIndex = 0;
        Node<T> currentNode = head;
        Node<T> prevNode = null;
        while (currentNode.next != null && searchIndex < index) {
            if (searchIndex == index - 1) {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
            searchIndex++;
        }

        if (searchIndex < index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<T>(value);
        newNode.next = currentNode;
        prevNode.next = newNode;
    }
    public void erase(int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("Head is null");
        }
        int searchIndex = 0;
        Node<T> currentNode = head;
        Node<T> prevNode = null;
        while (currentNode.next != null && searchIndex < index) {
            if (searchIndex == index - 1) {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
            searchIndex++;
        }

        if (searchIndex < index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        prevNode.next = currentNode.next;
    }
}
