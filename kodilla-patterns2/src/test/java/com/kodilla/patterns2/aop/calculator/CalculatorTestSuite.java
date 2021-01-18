package com.kodilla.patterns2.aop.calculator;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    private static Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd() {
        //given
        //when
        double result = calculator.add(10,15);
        //then
        LOGGER.info("Testing add method");
        assertEquals(25, result, 0);
    }
    @Test
    public void testSub() {
        //given
        //when
        double result = calculator.sub(10,15);
        //then
        LOGGER.info("Testing sub method");
        assertEquals(-5, result, 0);
    }
    @Test
    public void testMul() {
        //given
        //when
        double result = calculator.mul(10,15);
        //then
        LOGGER.info("Testing mul method");
        assertEquals(150, result, 0);
    }
    @Test
    public void testFactorial() {
        //given
        //when
        BigDecimal result = calculator.factorial(new BigDecimal(7));
        //then
        LOGGER.info("Testing factorial method");
        assertEquals(new BigDecimal(5040), result);
    }

}
