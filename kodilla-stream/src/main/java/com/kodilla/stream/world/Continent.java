package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private List<Country> countries = new ArrayList<>();
    private String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getContinentName() {
        return continentName;
    }
}
