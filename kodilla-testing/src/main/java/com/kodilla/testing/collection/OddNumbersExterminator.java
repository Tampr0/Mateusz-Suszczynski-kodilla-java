package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        if (numbers.isEmpty()) {
            return numbers;
        }
        else {
            for (int i = 0; i < numbers.size(); i++) {
                if ((i % 2) == 0) {
                    oddNumbers.add(i);
                }
            }
        }
        return oddNumbers;
    }
}
