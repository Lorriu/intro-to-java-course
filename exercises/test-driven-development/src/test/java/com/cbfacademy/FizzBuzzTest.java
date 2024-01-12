package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("The FizzBuzz should")
public class FizzBuzzTest {

    @Test
    @DisplayName("Testing for FizzBuzz")
    public void testFizzBuzz() {

        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));

    }
    
    @Test
    @DisplayName("Testing for 1")
    public void testOne() {

        assertEquals(" 1", FizzBuzz.generate(1, 1));

    }
    
    @Test
    @DisplayName("Testing for Fizz")
    public void testFizz() {

        assertEquals(" 1 2 Fizz", FizzBuzz.generate(1, 3));

    }
    
}
