package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        

        public List<String> fizzBuzz(List<Integer> numbers) {
            List<String> fizzBuzzList = new ArrayList<>();
    
            for (Integer number : numbers) {
                if (number % 3 == 0 && number % 5 == 0) {
                    fizzBuzzList.add("FizzBuzz");
                } else if (number % 3 == 0) {
                    fizzBuzzList.add("Fizz");
                } else if (number % 5 == 0) {
                    fizzBuzzList.add("Buzz");
                } else {
                    fizzBuzzList.add(Integer.toString(number));
                }
            }
            

        //  - it returns the constructed list
            return fizzBuzzList;


        //throw new RuntimeException("Not implemented");
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        //  - if the ${number} is invalid, the method should return "Invalid month number"

        if (number >= 1 && number <= 12) {
            return months[number - 1];
        } else {
            return "Invalid month number";
        }
    }

        //throw new RuntimeException("Not implemented");

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100

        Map<String, Integer> resultMap = new HashMap<>();

            int calculatedSumOfEvens = 0;
            int calculatedSumOfOdds = 0;

            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                     //  - determines the sum of all the even numbers in the list
                    calculatedSumOfEvens += i;
                } else {
                    //  - determines the sum of all the odd numbers in the list
                    calculatedSumOfOdds += i;
                }
            }
       

        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        resultMap.put("SumOfEvens", calculatedSumOfEvens);
        resultMap.put("SumOfOdds", calculatedSumOfOdds);
        
        return resultMap;

        //throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers

        ArrayList<Integer> reversedList = new ArrayList<>(numbers);

        //  - it returns the list in reverse order

        Collections.reverse(reversedList);

        return reversedList;
       // throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
