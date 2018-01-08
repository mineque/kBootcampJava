package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class World {

    ArrayList<Continent> continents = new ArrayList<>();


    public World(ArrayList<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity(){
        return this.continents.size()

    }
}
