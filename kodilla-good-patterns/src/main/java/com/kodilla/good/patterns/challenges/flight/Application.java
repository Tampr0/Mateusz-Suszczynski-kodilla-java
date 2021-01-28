package com.kodilla.good.patterns.challenges.flight;

public class Application {
    public static void main(String[] args){

        FlightSearch flightSearch = new FlightSearch();
        flightSearch.add(new Flight("Wrocław", "Warszawa"));
        flightSearch.add(new Flight("Wrocław", "Kraków"));
        flightSearch.add(new Flight("Kraków", "Warszawa"));
        flightSearch.add(new Flight("Warszawa", "Gdańsk"));
        flightSearch.add(new Flight("Gniezno", "Kraków"));
        flightSearch.add(new Flight("Gdańsk", "Kraków"));
        flightSearch.add(new Flight("Kraków", "Gdynia"));
        flightSearch.add(new Flight("Warszawa", "Żory"));
        flightSearch.add(new Flight("Warszawa", "Malbork"));
        flightSearch.add(new Flight("Wrocław", "Moskwa"));


        System.out.println("Flights by selected departure airport: Wrocław");
        System.out.println(flightSearch.searchForFlightsFromAGivenCity("Wrocław"));
        System.out.println("Flights by selected arrival airport: Warszawa");
        System.out.println(flightSearch.searchForFlightsToAGivenCity("Warszawa"));

        System.out.println();

        System.out.println("Flights by Wrocław - Warszawa - Gdańsk");
        System.out.println(flightSearch.flightToCityWithTransfer("Wrocław", "Warszawa", "Gdańsk"));
    }
}
