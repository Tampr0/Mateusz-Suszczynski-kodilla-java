package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given

        World earth = new World();

        Continent asia = new Continent();
        Continent europa = new Continent();
        earth.addContinent(asia);
        earth.addContinent(europa);

        asia.addCountry(new Country("Japan", new BigDecimal("100")));
        asia.addCountry(new Country("Korea", new BigDecimal("100")));
        asia.addCountry(new Country("China", new BigDecimal("100")));
        europa.addCountry(new Country("Poland", new BigDecimal("100")));
        europa.addCountry(new Country("France", new BigDecimal("100")));
        europa.addCountry(new Country("Germany", new BigDecimal("100")));
        europa.addCountry(new Country("England", new BigDecimal("100")));

        //When
        BigDecimal totalPeople = earth.getPeopleQuantity();
        BigDecimal expectedPeople = new BigDecimal("700");

        //Then
        Assert.assertEquals(totalPeople, expectedPeople);

    }
}
