package com.matejkonrad;

public class Node<T> {
    Node<T> next;
    T data;

    Node(T value) {
        this.data = value;
    }
}
