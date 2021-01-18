package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //given
        PizzaOrder theOrder = new PizzaBasic();
        // when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(15), theCost);
    }
    @Test
    public void thestBasicPizzaOrderGetIngredients() {
        //given
        PizzaOrder theOrder = new PizzaBasic();
        //when
        String ingredients = theOrder.getIngredients();
        //then
        assertEquals("Basic pizza with tomato sauce and cheese", ingredients);
    }
    @Test
    public void testVegeWithExtraCheesePizzaOrderGetCost() {
        //given
        PizzaOrder theOrder = new PizzaBasic();
        theOrder = new ExtraCheese(theOrder);
        theOrder = new VegeTypePizza(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(23), theCost);
    }
    @Test
    public void testVegeWithExtraCheesePizzaOrderGetIngredients() {
        //given
        PizzaOrder theOrder = new PizzaBasic();
        theOrder = new ExtraCheese((theOrder));
        theOrder = new VegeTypePizza(theOrder);
        //when
        String ingredients = theOrder.getIngredients();
        //then
        assertEquals("Basic pizza with tomato sauce and cheese + extra cheese + vege", ingredients);
    }

}
