package com.muko;
import com.muko.Coffee; // local package

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Latte");
        System.out.println(coffee.getType());

    }
}

