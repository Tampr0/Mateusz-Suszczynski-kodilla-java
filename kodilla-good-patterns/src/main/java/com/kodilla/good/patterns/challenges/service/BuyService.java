package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public interface BuyService {
    boolean buy(User user, Product product, LocalDateTime buyTimer);
}
