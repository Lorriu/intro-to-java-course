package com.cbfacademy.shapes;

//create a `Circle` class:
// - with a `radius` attribute
// - and it implements the `Enclosure` interface


public class Circle implements Enclosure {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

