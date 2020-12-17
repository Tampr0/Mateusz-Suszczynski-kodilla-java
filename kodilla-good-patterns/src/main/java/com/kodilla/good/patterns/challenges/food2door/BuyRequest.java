package com.kodilla.good.patterns.challenges.food2door;

public class BuyRequest {
    Supplier supplier;
    double amount;
    String productName;

    public BuyRequest(Supplier supplier, double amount, String productName) {
        this.supplier = supplier;
        this.amount = amount;
        this.productName = productName;
    }
}
