package com.cbfacademy.shapes;


//create a concrete class `Rectangle` that extends `Shape`
public class Rectangle  extends Shape{
    
    private double length;
    private double width;

    //constructor
    Rectangle(double length, double width){

        this.length = length;
        this.width = width;

    }

    //overrides the base method. The value is given by the formula (`length` * `width`)
    @Override
    double getArea(){

        return length * width;

    }
    
}
