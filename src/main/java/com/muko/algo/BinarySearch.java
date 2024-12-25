package com.muko.algo;
import java.util.Random;

public class BinarySearch {
    public static int[] elements = new int[10];
    static int target = 4; // Assuming its always 4

    static boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("Target: \t" + arr[mid]);
                return true;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            }

            else
                high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {

        for (int i = 0; i < elements.length; i++)  {
            elements[i] = i;
        }
        System.out.println(binarySearch(elements, target));


    }

}
