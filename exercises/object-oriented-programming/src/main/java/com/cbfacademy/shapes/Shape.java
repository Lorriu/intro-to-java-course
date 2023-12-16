package com.cbfacademy.shapes;

//create an abstract class `Shape` 
public abstract class Shape {

    private String name;
    
    //returns the area of the shape
   public abstract double getArea();


    //returns the name of the shape
    String getName(){
        
        return this.name;
    }
}
