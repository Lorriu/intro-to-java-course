package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {

        
         String fullWords = word1.concat(word2).concat(word3);


        return fullWords;

        // TODO: Write code that concatenates the input parameters and returns the result
        
    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings

        boolean result = word1.equals(word2);


        return result;

        
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023

        String amount = String.format("%.2f", price);

        String priceString = "Item: " + item + ". Price: £" + amount + ". Quantity: " + quantity;

        return priceString;

    
    }
}
