package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaBasic implements PizzaOrder {

    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    public String getIngredients() {
        return "Basic pizza with tomato sauce and cheese";
    }
}
