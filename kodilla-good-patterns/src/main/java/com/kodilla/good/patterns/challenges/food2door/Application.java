package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args){

        FoodOrder foodOrder = new FoodOrder(new HealthyShop(85,2), "milk", 23);
        FoodOrder foodOrder1 = new FoodOrder(new HealthyShop(20,1), "Pad thai", 36);
        FoodOrder foodOrder2 = new FoodOrder(new ExtraFoodShop(41), "pasta", 12);
        FoodOrder foodOrder3 = new FoodOrder(new GlutenFreeShop(41), "chicken", 12);

        OrderProcessor orderProcessor = new OrderProcessor(new MailInformation(), new ProviderOrderService());
        orderProcessor.process(foodOrder);

        System.out.println();
        orderProcessor.process(foodOrder1);

        System.out.println();
        orderProcessor.process(foodOrder2);

        System.out.println();
        orderProcessor.process(foodOrder3);
    }
}
