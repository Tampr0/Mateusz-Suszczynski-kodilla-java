package com.kodilla.good.patterns.challenges.service;

import java.util.List;

public class TheShopService {
    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = new BuyRequest(buyRequestRetriever.retrieve());
        BuyProcessor buyProcessor = new BuyProcessor(new SMSService(), new TheShopBuyService(), new TheShopRepository());

        buyProcessor.process(buyRequest);







//        List<String> theShopRepositoryListList = buyProcessor.getTheShopRepositoryList();
//
//        System.out.println("Wyświetl listę: ");
//        System.out.println(theShopRepositoryListList);
    }
}
