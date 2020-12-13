package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class BuyRequestRetriever {
    public BuyRequest retrieve() {
        User user = new User("Mateusz", "Suszczyński");
        Product product = new Product("Telewizor");
        LocalDateTime buyTime = LocalDateTime.now();

        return new BuyRequest(user, product, buyTime);
    }
}
