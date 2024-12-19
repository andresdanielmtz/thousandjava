package com.muko.dsa;
import java.util.LinkedList;

/*
*  This is an implementation using the in-built linked list implementation for the Java STD.
*/

/**
 *
 * addFirst() 	Adds an item to the beginning of the list
 * addLast() 	Add an item to the end of the list
 * removeFirst() 	Remove an item from the beginning of the list
 * removeLast() 	Remove an item from the end of the list
 * getFirst() 	Get the item at the beginning of the list
 * getLast() 	Get the item at the end of the list
 *
 * */

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
    }
}

