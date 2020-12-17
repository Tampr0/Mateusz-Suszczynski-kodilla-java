package com.kodilla.good.patterns.challenges.flight;

public class Application {
    public static void main(String[] args) {
        FlightDataBase flightDataBase = new FlightDataBase();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightDataBase);
//        flightSearchEngine.findDeparture("Wrocław");

        System.out.println(flightSearchEngine.flightToCityWithTransfer("Wrocław", "Warszawa", "Gdańsk"));



    }



}
