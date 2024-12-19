package com.muko.dsa;

public class Array {
    public static int[] elements = new int[10]; // Can be accessed WITHOUT having to instance the class, very useful!

    public static void main(String[] args) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int) Math.pow(i, 2); // i^2
            System.out.format("The number for %d is: %d \n", i, elements[i]); // The number for 0 is 0, 1 is 1, 2 is 4, etc...
        }
    }
}
