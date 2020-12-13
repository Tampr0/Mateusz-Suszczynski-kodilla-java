package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;
import java.util.List;

public class BuyProcessor {
    private InformationService informationService;
    private BuyService buyService;
    private BuyRepository buyRepository;

    public BuyProcessor(final InformationService informationService, final BuyService buyService, final BuyRepository buyRepository) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.buyRepository = buyRepository;
        }

    public BuyDto process(final BuyRequest buyRequest) {
        boolean isBuy = buyService.buy(buyRequest.getUser(), buyRequest.getProduct(), buyRequest.getBuyTime());
        if (isBuy) {
            informationService.inform(buyRequest.getUser(), buyRequest.getProduct());
            buyRepository.createBuy(buyRequest.getUser(), buyRequest.getProduct(), LocalDateTime.now());
            return new BuyDto(buyRequest.getUser(), true);
        }
        else {
            return new BuyDto(buyRequest.getUser(), false);
        }
    }
    public List<String> getTheShopRepositoryList() {
        return buyRepository.getTheRepositoryList();
    }
}
