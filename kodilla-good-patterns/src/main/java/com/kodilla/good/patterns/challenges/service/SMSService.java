package com.kodilla.good.patterns.challenges.service;

public class SMSService implements InformationService {

    @Override
    public void inform(final User user, final Product product) {
        System.out.println("SMS");
        System.out.println(user.toString() + ", właśnie zakupiłeś nowiutki " + product.getName());
    }
}
