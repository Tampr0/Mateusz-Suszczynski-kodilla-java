package com.kodilla.stream.world;


import java.math.BigDecimal;

public final class Country {
    private final String nameOfTheCountry;
    private final BigDecimal peopleQuantity;

    public Country(final String nameOfTheCountry, final BigDecimal peopleQuantity) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameOfTheCountry() {
        return nameOfTheCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}

