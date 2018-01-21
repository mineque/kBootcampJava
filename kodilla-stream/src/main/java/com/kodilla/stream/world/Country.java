package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal peopleQuantity;
    private String countryName;

    public Country(BigDecimal peoples, String countryName) {
        this.peopleQuantity = peoples;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "peopleQuantity=" + peopleQuantity +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
