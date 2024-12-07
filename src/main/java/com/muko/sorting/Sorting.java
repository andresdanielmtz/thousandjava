package com.muko.sorting;

public class Sorting {
    static int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

    int[] bubbleSort() {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    ;

    public static void main(String[] args) {
        System.out.println("Before sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("After sorting:");
        for (int number : new Sorting().bubbleSort()) {
            System.out.print(number + " ");
        }
    }
}
