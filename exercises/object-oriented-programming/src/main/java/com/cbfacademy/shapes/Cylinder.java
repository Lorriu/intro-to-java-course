package com.cbfacademy.shapes;


//create a concrete class `Cylinder` that extends `Shape`
public class Cylinder extends Shape{

    private double radius;
    private double height;

    //constructor
    Cylinder(double radius, double height){

        this.radius = radius;
        this.height = height;


    }

    /*overrides the base method. The value is given by the 
    formula (`height` * `𝛑` * (`radius`<sup>2</sup>)).*/
    @Override
    public double getArea(){

        return height * Math.PI * Math.pow(radius, 2);
    }



}
