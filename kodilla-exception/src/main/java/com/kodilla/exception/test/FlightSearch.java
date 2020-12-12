package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Tokyo", true);
        flightMap.put("Berlin", true);
        flightMap.put("Warsaw", true);
        flightMap.put("Madrit", true);

        if (flightMap.getOrDefault(flight.getArrivalAirport(), false) == true) {
            System.out.println(flight.toString() + " exists");
        }
        else {
            throw new RouteNotFoundException("There's no flight like " + flight.toString());
        }
    }
}


