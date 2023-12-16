package com.cbfacademy.shapes;

public class Paint {
    
    private double coverage;

    /*constructor that accepts a parameter representing the number of 
    square feet per gallon this paint can cover*/
    public Paint(double coverage){

        this.coverage = coverage;

    }

    //returns the amount of paint (measured in gallons) needed to paint a given shape
    public double getAmount(Shape shape){

        double paintAmount = shape.getArea();
        return paintAmount / coverage;

    }

}
