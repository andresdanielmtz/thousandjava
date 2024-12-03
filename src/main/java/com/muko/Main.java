package com.muko;

public class Main {
    public static void main(String[] args) {

        int cadence = 0;
        int[] anArray = new int[10];
        anArray[0] = 100;
        System.out.println("arr[0]: " + anArray[0]);

        String[][] names = {
                {
                    "Mr. ", "Mrs. ", "Ms. "
                },
                {
                    "Smith", "Jones"
                }
        };

        System.out.println("Mr Smith in Theory: " + names[0][0]+ names[1][0]);

        System.out.println("Hello, World!");
    }
}