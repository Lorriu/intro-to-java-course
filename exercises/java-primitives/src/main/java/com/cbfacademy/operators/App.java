package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int number1 = 12;
        int number2 = 12;

        System.out.println(number1++);
        System.out.println(++number2);

        // arrays practice 

            int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
    
            System.out.println(array1[4]);
            
            float[] array2 = {12.4f, 5.6f, 6.8f, 7.6f, 8.6f, 6.6f, 11.2f, 14.5f, 15.6f, 16.5f, 17.8f, 18.7f};
    
            System.out.println(array2[4]);
            
            double[] array3 = {10.6d, 20.6d, 30.6d, 40.6d, 50.6d};
    
            System.out.println(array3[4]);
    
            boolean[] array4 = {true, false, false, true, true, false};
    
            System.out.println(array4[4]);        


    }

    public static double add(double operand1, double operand2) {
        
        double addOperator = operand1 + operand2;

        return addOperator;

    }

    public static double subtract(double operand1, double operand2) {
        
        double subtractOperator = operand1 - operand2;

        return subtractOperator;

    }

    public static double multiply(double operand1, double operand2) {
        
        double multiplyOperator = operand1 * operand2;

        return multiplyOperator;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        
        boolean equalCheck = (operand1 == operand2);

        return equalCheck;

    }

    public static Boolean isLessThan(double operand1, double operand2) {
        
        boolean lessThanCheck = (operand1 < operand2);

        return lessThanCheck;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        
        boolean isMoreCheck = (operand1 > operand2);

        return isMoreCheck;

    }
}

