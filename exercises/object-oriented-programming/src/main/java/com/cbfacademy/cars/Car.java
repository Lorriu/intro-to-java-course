package com.cbfacademy.cars;

public class Car {

    //car class attritubes
    
    private String make;
    private String model;
    private String colour;
    private int year;
    
    //constructor with parameters for the car
    public Car(String make, String model, String colour, int year){

        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;

    }

        // returns the car make
        public String getMake(){

            return this.make;

        }
       
        //returns the car model
        public String getModel(){

            return this.model;

        }
      
        //returns the year the car was made
        public int getYear(){

            return this.year;

        }

        //returns the colour of the car
        public String getColour(){

            return this.colour;

        }
        
        //sets the colour of the car
        public String setColour(String newColour){

           return this.colour = newColour; 
        }
        
        //returns the car details, including the make, model, colour and year
        public String getDetails(){

            return(this.make + this.model + this.colour + this.year);
        }
}
