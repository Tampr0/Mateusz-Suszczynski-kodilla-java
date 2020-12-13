package com.kodilla.good.patterns.challenges.service;

public class BuyDto {
    private User user;
    private boolean isBuy;

    public BuyDto(final User user, final boolean isBuy) {
        this.user = user;
        this.isBuy = isBuy;
    }

    public User getUser() {
        return user;
    }

    public boolean isBuy() {
        return isBuy;
    }
}
