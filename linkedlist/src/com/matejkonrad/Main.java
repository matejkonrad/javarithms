package com.matejkonrad;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> list =  new LinkedList<Integer>();

	    list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        System.out.println("Value at 0: " + list.valueAt(0));
        System.out.println("Value at 1: " + list.valueAt(1));
        System.out.println("Value at 2: " + list.valueAt(2));

        list.pushBack(5);

        System.out.println("Value at 3 (push back): " + list.valueAt(3));
        System.out.println("Size " + list.size());

        list.popFront();

        System.out.println("Value at front pop: " + list.valueAt(0) + " size: " + list.size());

        list.popBack();

        System.out.println("Value at back pop: " + list.valueAt(1)+ " size: " + list.size());

        list.insert(1, 123);

        System.out.println("Value at insert: " + list.valueAt(1)+ " size: " + list.size());

        list.reverse();
        System.out.println("Value at 0: " + list.valueAt(0));
        System.out.println("Value at 1: " + list.valueAt(1));
        System.out.println("Value at 2: " + list.valueAt(2));

    }
}
