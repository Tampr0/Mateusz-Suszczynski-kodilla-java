package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class BuyRequest {
    private BuyRequest buyRequest;
    private User user;
    private Product product;
    private LocalDateTime buyTime;

    public BuyRequest(final User user, final Product product, final LocalDateTime buyTime) {
        this.user = user;
        this.product = product;
        this.buyTime = buyTime;
    }
    //special constructor for retrieve() method from BuyRequestRetriever class
    public BuyRequest(final BuyRequest buyRequest) {
        this.buyRequest = buyRequest;
        this.user = buyRequest.user;
        this.product = buyRequest.product;
        this.buyTime = buyRequest.buyTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }
}
