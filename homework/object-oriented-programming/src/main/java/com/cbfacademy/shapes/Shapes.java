package com.cbfacademy.shapes;

import java.util.List;
import java.util.ArrayList;

public class Shapes {

    //it should have a `computeArea` method that takes a list of `Enclosure` objects and computes the sum of their areas

    
         public static double computeArea(List<Enclosure> shapes) {

                double totalArea = 0;

                for (Enclosure shape : shapes) {

                    totalArea += shape.area();

                }

                return totalArea;
         }

    //it should have a `computePerimeter` method that takes a list of `Enclosure` objects and computes the sum of their perimeters

        public static double computePerimeter(List<Enclosure> shapes) {

            double totalPerimeter = 0;

            for (Enclosure shape : shapes) {

                totalPerimeter += shape.perimeter();

            }
                return totalPerimeter;
        }


    public static void main(String[] args) {

        //create a **program** `Shapes` that computes the perimeter and area of various shapes:

        Square square1 = new Square(20);
        Square square2 = new Square(4);
        Square square3 = new Square(12);

        
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(5);
            

            List<Enclosure> shapes = new ArrayList<>();
            shapes.add(square1);
            shapes.add(square2);
            shapes.add(square3);
            shapes.add(circle1);
            shapes.add(circle2);
            shapes.add(circle3);

        System.out.println(computeArea(shapes));
        System.out.println(computePerimeter(shapes));

    }

    
    
    }

    

