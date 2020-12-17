package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sumScore = calculator.add(2,2);
        double subScore = calculator.sub(4,2);
        double mulScore = calculator.mul(2,2);
        double divScore = calculator.div(4,2);
        //Then
        Assert.assertEquals(4, sumScore, 0);
        Assert.assertEquals(2, subScore, 0);
        Assert.assertEquals(4, mulScore, 0);
        Assert.assertEquals(2, divScore, 0);
    }
}
