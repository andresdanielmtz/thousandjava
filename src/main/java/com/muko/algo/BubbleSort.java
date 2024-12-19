package com.muko.algo;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static int[] elements = new int[10];
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < elements.length; i++) {
            elements[i] = r.nextInt(100); // from 0 to 100
        }

        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    // Swapping elements[j] and elements[j+1]
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(elements));
    }
}
