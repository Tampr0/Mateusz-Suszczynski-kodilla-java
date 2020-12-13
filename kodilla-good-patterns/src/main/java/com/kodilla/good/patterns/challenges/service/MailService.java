package com.kodilla.good.patterns.challenges.service;

public class MailService implements InformationService {
    @Override
    public void inform(final User user, final Product product) {
        System.out.println("POWIADOMIENIE MAILOWE");
        System.out.println(user.toString() + ", właśnie zakupiłeś nowiutki " + product.getName());
    }
}
