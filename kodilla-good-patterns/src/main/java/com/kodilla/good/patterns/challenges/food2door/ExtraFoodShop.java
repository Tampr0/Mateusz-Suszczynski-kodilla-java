package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Provider {

    private final double price;
    public String NAME = "Extra Food Shop";

    public ExtraFoodShop(final double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean process(FoodOrder foodOrder){
        System.out.println("Zamówienie ze sklepu " + NAME + " rozpoczęte...");
        double standardPayment = foodOrder.getQuantity() * getPrice();
        System.out.println( "Cena za zamówienie: " + standardPayment + " zł");
        return true;
    }
}
