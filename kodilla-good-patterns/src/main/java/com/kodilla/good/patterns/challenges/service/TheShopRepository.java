package com.kodilla.good.patterns.challenges.service;


import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class TheShopRepository implements BuyRepository {
    private List<String> theRepositoryList;

    @Override
    public boolean createBuy(final User user, final Product product, final LocalDateTime buyTime) {
        String buy ="ZAKUP: [KUPUJĄCY: " + user.toString() + ", PRODUKT: " + product.getName() + ", DATA ZAKUPU: " +  buyTime.toString() + "]";
        this.theRepositoryList = new LinkedList<>();
        this.theRepositoryList.add(buy);

        return true;
    }
    @Override
    public List<String> getTheRepositoryList() {
        return this.theRepositoryList;
    }

}
