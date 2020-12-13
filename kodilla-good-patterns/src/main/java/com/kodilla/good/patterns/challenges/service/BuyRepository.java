package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;
import java.util.List;

public interface BuyRepository {
    boolean createBuy(User user, Product product, LocalDateTime buyTime);
    List<String> getTheRepositoryList();
}
