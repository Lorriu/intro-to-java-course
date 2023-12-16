package com.cbfacademy.shapes;


//create a concrete class `Sphere` that extends `Shape`
public class Sphere extends Shape {

    private double radius;

    //constructor
    Sphere(double radius){

        this.radius = radius;

    }
    

    /*overrides the base method. The value is 
    given by the formula (`4` * `𝛑` * (`radius`<sup>2</sup>))*/
    @Override
    double getArea(){

        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
