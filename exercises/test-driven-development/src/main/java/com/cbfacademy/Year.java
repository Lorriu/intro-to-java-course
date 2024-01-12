package com.cbfacademy;

//Create a class `Year`

public class Year {
    
//with a `isLeap` method that checks whether its input integer is a Leap Year or not:

    public boolean isLeap(int leapYear){

        //years divisible by `400` are leap years
        if (leapYear % 400 == 0){

            return true;
        }
        //years divisible by `100` but not by `400` are not leap years
        else if (leapYear % 100 == 0){

            return false;
        }
        //years divisible by `4` but not by `100` are leap years
        else if (leapYear % 4 == 0){

            return true;
        }

        //years not divisible by `4` are not leap years
        else{

            return false;
        }
    
    }

}
