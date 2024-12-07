package com.muko.oop;

public class Latte extends Coffee {
    String flavor;

    public Latte(String type, double amountOfCaffeineMG, String flavor) {
        super(type, amountOfCaffeineMG);
        this.flavor = flavor;
    }

    public void printType() { // polymorphism, it modifies the behavior of the method in the parent class
        System.out.println("This coffee is of type: " + getType() + " and flavor: " + flavor);
    }

    public void specialMessage(String msg) {
        System.out.println("This is a special message: " + msg);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

}
