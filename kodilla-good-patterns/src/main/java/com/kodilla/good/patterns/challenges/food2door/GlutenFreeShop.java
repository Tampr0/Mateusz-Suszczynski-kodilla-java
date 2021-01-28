package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Provider {
    public double price;
    public String NAME = "Gluten Free Shop";

    public GlutenFreeShop(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }



    public boolean process(FoodOrder foodOrder){
        System.out.println("Zamówienie ze sklepu " + NAME + " rozpoczęte...");
        double standardPrice = foodOrder.getQuantity() * getPrice();


        if(foodOrder.getQuantity() > 5 ){
            System.out.println("Cena zamówienia: " + standardPrice + " zł");
        } else {
            System.out.println("Zbyt małe zamówienie: ");
            return false;
        }
        return true;
    }
}
