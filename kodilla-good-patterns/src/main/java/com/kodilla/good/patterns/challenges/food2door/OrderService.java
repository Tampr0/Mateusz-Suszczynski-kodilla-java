package com.kodilla.good.patterns.challenges.food2door;

public interface OrderService {
    boolean order(Provider provider, String product, double quantity);
    void informProvider(Provider provider, FoodOrder foodOrder);
}
