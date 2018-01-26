package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> airportAvailability = new HashMap<>();

        airportAvailability.put("Warsaw", true);
        airportAvailability.put("Cracow", true);
        boolean ok;

        try {
            ok = airportAvailability.get(flight.getArrivalAirport());
        } catch (Exception e) {
            throw new RouteNotFoundException();
        }
        System.out.println("Flight found");


    }
    public static void main(String[] args) {
        Flight AtoB = new Flight("Warsaw","Cracow");
        Flight CtoD = new Flight("Gdansk","Rzeszow");

        FlightFinder searcher = new FlightFinder();

        try {
            System.out.println("AtoB:");
            searcher.findFlight(AtoB);
        } catch (RouteNotFoundException e) {
            System.out.println("At least one airport is not available");
        }

        try {
            System.out.println("CtoD:");
            searcher.findFlight(CtoD);
        } catch (RouteNotFoundException e) {
            System.out.println("At least one airport is not available");
        }
    }
}
