package com.kodilla.good.patterns.challenges.flight;


import java.util.HashSet;

public final class FlightDataBase {

    public static HashSet<Flight> getTheFlightList() {
        HashSet<Flight> theFlightList = new HashSet<>();
        //theFlightList.add(new Flight("Wrocław", "Warszawa"));
        theFlightList.add(new Flight("Warszawa", "Wrocław"));
        theFlightList.add(new Flight("Wrocław", "Warszawa"));
        theFlightList.add(new Flight("Gdańsk", "Wrocław"));
        theFlightList.add(new Flight("Wrocław", "Gdańsk"));
        theFlightList.add(new Flight("Wrocław", "Kraków"));
        theFlightList.add(new Flight("Kraków", "Wrocław"));
        theFlightList.add(new Flight("Warszawa", "Gdańsk"));
        theFlightList.add(new Flight("Gdańsk", "Warszawa"));
        theFlightList.add(new Flight("Kraków", "Warszawa"));
        theFlightList.add(new Flight("Warszawa", "Kraków"));
        theFlightList.add(new Flight("Poznań", "Wrocław"));
        theFlightList.add(new Flight("Wrocław", "Poznań"));
        theFlightList.add(new Flight("Poznań", "Warszawa"));
        theFlightList.add(new Flight("Warszawa", "Poznań"));
        theFlightList.add(new Flight("Poznań", "Gdańsk"));
        theFlightList.add(new Flight("Gdańsk", "Poznań"));
        theFlightList.add(new Flight("Poznań", "Kraków"));
        theFlightList.add(new Flight("Kraków", "Poznań"));
        return theFlightList;
    }
}
