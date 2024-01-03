package com.cbfacademy;

//Create a class `FizzBuzz` 

public class FizzBuzz {

//with a `get` method that takes a number and returns a string, but such that:

    public String get(int number){

            //for multiples of 15, it returns `“FizzBuzz”` instead of the number
            if (number % 15 == 0) {

                return "FizzBuzz";
            
            //for multiples of 3, it returns `“Fizz”` instead of the number
            } else if (number % 3 == 0) {

                return"Fizz";

            //for multiples of 5, it returns `“Buzz”` instead of the number        
            } else if (number % 5 == 0) {
                
                return"Buzz";
            
            //the string representation of the number otherwise
            } else {
                    return(String.valueOf(number));

            }
    
    }
}