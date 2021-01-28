package com.kodilla.good.patterns.challenges.food2door;

public class SaleDto {
    public FoodOrder foodOrder;
    public boolean isOrdered;

    public SaleDto(FoodOrder foodOrder, boolean isOrdered) {
        this.foodOrder = foodOrder;
        this.isOrdered = isOrdered;
    }

    public FoodOrder getFoodOrder() {
        return foodOrder;
    }
}
