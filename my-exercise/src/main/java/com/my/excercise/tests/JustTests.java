package com.my.excercise.tests;

import java.util.function.IntUnaryOperator;

public class JustTests {
    public static void main(String[] args) {

        IntUnaryOperator getSquare = intValue -> {
            int result = intValue * intValue;
            System.out.println("Getting square: " + result);
            return result;
        };
        int wynik = getSquare.applyAsInt(3);
        System.out.println(wynik);

        IntUnaryOperator getNextInt = intValue -> {   // lambda expression
            int result = intValue+1;
            System.out.println("Getting Next Int: "+ result);
            return result;
        };
        IntUnaryOperator getSquareOfNext = getSquare.andThen(getNextInt);
        IntUnaryOperator getNextOfSquare = getSquare.compose(getNextInt);

        int input = 3;
        System.out.println("Input int value: "+ input);
        System.out.println();
        int squareOfNext = getSquareOfNext.applyAsInt(input);
        System.out.println("Square of next int value: "+ squareOfNext);



    }
}
