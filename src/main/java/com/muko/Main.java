package com.muko;

import com.muko.oop.Latte; // local package
import com.muko.sorting.Sorting; // local package

public class Main {
    public static void main(String[] args) {
        Latte latte = new Latte("Latte", 100, "Vanilla");
        latte.printType();
        latte.specialMessage("This is a very good latte!");


        Sorting sortingExample = new Sorting();
        Sorting.main(args);
    }
}

