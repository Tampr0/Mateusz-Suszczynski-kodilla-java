package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraMeat extends AbstractPizzaOrderDecoration{
    public ExtraMeat(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " extra meat";
    }
}
