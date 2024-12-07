package com.muko.oop;

abstract public class Coffee {
    private String type; // class attribute
    private double amountOfCaffeineMG; // class attribute

    public Coffee(String type, double amountCaffeineMG) {
        this.type = type;
        this.amountOfCaffeineMG = amountCaffeineMG;
    }

    public abstract void specialMessage(String msg);

    public void printType() {
        System.out.println("This coffee is of type: " + type);
    }

    public double getAmountOfCaffeineMG() {
        return amountOfCaffeineMG;
    }

    public void setAmountOfCaffeineMG(double amountOfCaffeineMG) {
        this.amountOfCaffeineMG = amountOfCaffeineMG;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

