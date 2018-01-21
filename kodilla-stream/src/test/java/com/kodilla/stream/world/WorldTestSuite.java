package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity(){

        //Given

        Country poland = new Country(new BigDecimal("38000000"),"Poland");
        Country c2 = new Country(new BigDecimal("40000000"),"DE");
        Country c3 = new Country(new BigDecimal("10000000"),"EN");

        Continent europe = new Continent("Europe");
        europe.getCountries().add(poland);
        europe.getCountries().add(c2);
        europe.getCountries().add(c3);

        Country usa = new Country(new BigDecimal("38000000"),"UUSA");
        Country canada = new Country(new BigDecimal("40000000"),"Canada");
        Country mexico = new Country(new BigDecimal("10000000"),"mexico");

        Continent northAmerica = new Continent("North America");
        northAmerica.getCountries().add(usa);
        northAmerica.getCountries().add(canada);
        northAmerica.getCountries().add(mexico);

        World world = new World();
        world.getContinents().add(europe);
        world.getContinents().add(northAmerica);

        //When

        System.out.println(world.getPeopleQuantity());

        //Then

        Assert.assertEquals(new BigDecimal("176000000"),world.getPeopleQuantity());
    }
}
