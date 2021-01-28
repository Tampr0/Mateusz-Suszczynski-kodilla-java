package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrder {
    private final Provider provider;
    private final String product;
    private final double quantity;

    public FoodOrder(final Provider provider, final String product, final double quantity) {
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}
