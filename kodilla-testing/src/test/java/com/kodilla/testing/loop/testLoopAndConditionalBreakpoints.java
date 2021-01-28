package com.kodilla.testing.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        //given
        long sum = 0;
        //when
        for (int i = 0; i < 1000 ; i++) {
            sum += i;
            System.out.println("[" + i + "] Sum equals: " + sum);
        }
        //then
        assertEquals(499500, sum);
    }
}
