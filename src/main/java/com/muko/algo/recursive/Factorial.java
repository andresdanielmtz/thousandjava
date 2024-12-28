package com.muko.algo.recursive;


import java.util.Arrays;

// https://www.javatpoint.com/factorial-program-in-java
// Approach without dynamic programming, only recursion
// Therefore it will struggle with a higher enough number
public class Factorial {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    static int factorial_iterative(int n){
        int total = 1;
        for (int i = n; i > 0; i-- ) {
            total *= i;
        }
        return total;
    }

    static int factorialDP(int n) {
        int[] arr = new int[n + 1]; int i;
        arr[0]=1;

        for(i=1;i<=n;i++)
        {
            arr[i] = i * arr[i-1];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int fact = 1;
        int number = 6; // num to calculate factorial

        fact = factorial(number);
        int fact_iter = factorial_iterative(number);
        int fact_dp = factorialDP(number);

        System.out.println("Factorial of " + number + " is " + fact);
        System.out.println("Factorial (iterative) of " + number + " is " + fact_iter);
        System.out.println("Factorial (dynamic programming) of " + number + " is " + fact_dp);


    }
}
