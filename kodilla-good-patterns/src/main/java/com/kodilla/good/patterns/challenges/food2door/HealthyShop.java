package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Provider {
    public double price;
    public double bonusPrice;
    public String NAME = "Healthy Shop";


    public HealthyShop(double price, double bonusPrice) {
        this.price = price;
        this.bonusPrice = bonusPrice;
    }

    public double getPrice() {
        return price;
    }

    public double getBonusPrice() {
        return bonusPrice;
    }

    public boolean process(FoodOrder foodOrder){
        System.out.println("Zamówienie ze sklepu " + NAME + " rozpoczęte...");
        double standardPrice = foodOrder.getQuantity() * getPrice();
        double bonusPrice = foodOrder.getQuantity() * getBonusPrice();

        if(foodOrder.getQuantity() > 15){
            System.out.println("Bonus cenowy: " + bonusPrice + " zł");
            System.out.println("Cena zamówinia z bonusem: " + (standardPrice - bonusPrice) + " zł");
        } else {
            System.out.println("Cena zamówienia: " + standardPrice + " zł");
        }
        return true;
    }
}
