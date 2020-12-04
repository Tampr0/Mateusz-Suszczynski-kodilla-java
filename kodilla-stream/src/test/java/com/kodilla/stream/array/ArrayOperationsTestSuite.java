package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i]++;
        }
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(9.5, average,0);
    }
}
