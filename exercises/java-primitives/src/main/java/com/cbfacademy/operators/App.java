package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int number1 = 12;
        int number2 = 12;

        System.out.println(number1++);
        System.out.println(++number2);


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

