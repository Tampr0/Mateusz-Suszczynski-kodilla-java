package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Tokyo", true);
        flightMap.put("Berlin", true);
        flightMap.put("Warsaw", true);
        flightMap.put("Madrit", false);

        if (flightMap.containsKey(flight.getArrivalAirport())) {
            System.out.println("There is possibility to travel to " + flight.getArrivalAirport());
        }
        else {
            throw new RouteNotFoundException("There's no route");

        }





    }
}
