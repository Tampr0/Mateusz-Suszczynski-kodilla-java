package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Berlin", "Tokyo");
        Flight flight2 = new Flight("Warsaw", "Madrit");
        Flight flight3 = new Flight("Wien", "Stockholm");
        Flight flight4 = new Flight("New York", "London");
        Flight flight5 = new Flight("Los Angeles", "New York");
        Flight flight6 = new Flight("Madrit", "Berlin");

        FlightSearch flightSearch = new FlightSearch();
        try {
            flightSearch.findFlight(flight1);
            flightSearch.findFlight(flight2);
            flightSearch.findFlight(flight3);
            flightSearch.findFlight(flight4);
            flightSearch.findFlight(flight5);
            flightSearch.findFlight(flight6);

        }
        catch (RouteNotFoundException e) {
            System.out.println("Got exception - ROUTE NOT FOUND : " + e);
        }

    }
}
