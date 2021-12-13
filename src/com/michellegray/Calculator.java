package com.michellegray;

public class Calculator {

    //Instance variables
    private Floor floor;
    private Carpet carpet;

    //Constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    //Instance methods
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

}
