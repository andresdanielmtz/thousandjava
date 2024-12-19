package com.muko.algo;
import java.util.Arrays;
import java.util.Random;


public class LinearSearch {
    public static int[] elements = new int[10];
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < elements.length; i++) {
            elements[i] = r.nextInt(100); // from 0 to 100
        }

        System.out.println(Arrays.toString(elements));

        int target = elements[2]; // we'll always look out for the third element

        for (int i = 0; i < elements.length; i++) { // Goes element by element : )
            if (elements[i] == target) {
                System.out.println("The element was in the " + i + "th element of the array, the number being " + elements[i]);
            }
        }




    }


}
