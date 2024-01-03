package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;

//Create a class `FizzBuzz` 

public class FizzBuzz {

//with a `get` method that takes a number and returns a string, but such that:
//for multiples of 3, it returns `“Fizz”` instead of the number
//for multiples of 5, it returns `“Buzz”` instead of the number
//for multiples of 15, it returns `“FizzBuzz”` instead of the number
//the string representation of the number otherwise

    public List<String> get(){

    List<String> fizzBuzzList = new ArrayList<>();
    
            for (Integer number : numbers) {
                if (number % 15 == 0) {
                    fizzBuzzList.add("FizzBuzz");
                } else if (number % 3 == 0) {
                    fizzBuzzList.add("Fizz");
                } else if (number % 5 == 0) {
                    fizzBuzzList.add("Buzz");
                } else {
                    fizzBuzzList.add(Integer.toString(number));
                }
            }

            return fizzBuzzList;

        }


    
}
