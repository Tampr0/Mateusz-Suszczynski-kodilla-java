package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("There is an error");
        }

        // testing Calculator class methods

        Calculator calculator = new Calculator();

        // testing adding
        int addResult = calculator.add(4, 5);
        if (addResult == 4 + 5) {
            System.out.println("Add test ok!");
        }
        else {
            System.out.println("error in adding");
        }

        // testing subtracting
        int subtractResult = calculator.subtract(4, 5);
        if (subtractResult == 4 - 5) {
            System.out.println("Subtract test ok!");
        }
        else {
            System.out.println("error in subtracting");
        }

    }
}
