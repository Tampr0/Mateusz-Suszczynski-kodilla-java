package com.kodilla.good.patterns.challenges.food2door;

public class ProviderOrderService implements OrderService {

    public boolean order(Provider provider, String product, double quantity){
        return true;
    }
    public void informProvider(Provider provider, FoodOrder foodOrder){
        if (provider.process(foodOrder)) {
            System.out.println("Zamówienie przekazane do  " + foodOrder.getProvider());
        } else {
            System.out.println("Zamówienie nie może zostać zrealizowane");
        }
    }
}
