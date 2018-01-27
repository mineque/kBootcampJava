package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> airportAvailability = new HashMap<>();

        airportAvailability.put("Warsaw", true);
        airportAvailability.put("Cracow", true);
        boolean ok;

        try {
            ok = airportAvailability.get(flight.getArrivalAirport());
        } catch (Exception e) {
            throw new RouteNotFoundException();
        }
        return ok;


    }
    public static void main(String[] args) {
        Flight AtoB = new Flight("Warsaw","Cracow");
        Flight CtoD = new Flight("Gdansk","Rzeszow");

        FlightFinder searcher = new FlightFinder();

        try {
            System.out.println("AtoB:");
            boolean result = searcher.findFlight(AtoB);
            System.out.println("Flight available: " + result);
        } catch (RouteNotFoundException e) {
            System.out.println("At least one airport is not available");
        }

        try {
            System.out.println("CtoD:");
            boolean result = searcher.findFlight(CtoD);
            System.out.println("Flight available: " + result);
        } catch (RouteNotFoundException e) {
            System.out.println("At least one airport is not available");
        }
    }
}
