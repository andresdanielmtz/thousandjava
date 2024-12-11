package com.muko;

import com.muko.oop.Latte; // local package
import com.muko.sorting.Sorting; // local package
import com.muko.dsa.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Latte latte = new Latte("Latte", 100, "Vanilla");
        latte.printType();
        latte.specialMessage("This is a very good latte!");


        Sorting sortingExample = new Sorting();
        Sorting.main(args);

        Array.main(args);

        for (int i = 0; i < Array.elements.length; i++) {
            System.out.format("%d \t", Array.elements[i]);
        }
    }
}

