package com.michellegray;

public class Main {

    public static void main(String[] args) {

        //Testing Carpet class
        Carpet newCarpet = new Carpet(3.5);
        System.out.println(newCarpet.getCost());

        //Testing floor class
        Floor floor1 = new Floor(2.75, 4.0);
        System.out.println(floor1.getArea());

        //Testing Calculator class
        Calculator calculator = new Calculator(floor1, newCarpet);
        System.out.println("total = " + calculator.getTotalCost());



    }
}
