package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("With Sesame")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("Onion")
                .ingredient("Salat")
                .ingredient("Cucumber")
                .build();
        System.out.println(bigMac);
        //When
        int numbOfBurgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(2, numbOfBurgers);
        Assert.assertEquals(3, howManyIngredients);
    }
}
