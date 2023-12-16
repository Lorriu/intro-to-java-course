package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //instatiate the Showrrom object

        Showroom showroom = new Showroom();

        //call the getCars() method and print out the details of the Car instance
        List <Car> threeCars = showroom.getCars();

       for (Car car : threeCars) {
            System.out.println(car); 
        }
    }
}
