package com.muko.algo.recursive;

public class Fibonacci {
    static int fib_recursion(int n) {
        if (n < 0)
            System.out.println("Incorrect input");

        else if (n == 0)
            return 0;

        else if (n == 1 || n == 2)
            return 1;

        else
            return fib_recursion(n-1) + fib_recursion(n - 2);
        return n;
    }

    static void fib_iterative(int n) {
        int num1 = 0, num2 = 1, next_number = num2, count = 1;

        while (count <= n) {
            System.out.println(next_number + "\t");
            count += 1;
            num1 = num2;
            num2 = next_number;
            next_number = num1 + num2;
        }
    }

    public static void main(String[] args) {
        int res_recursion = fib_recursion(9);

        System.out.println("Fib, Recursive: \t " + res_recursion);
        System.out.println("FIb, Iterative: \t");
        fib_iterative(9);

    }
}
