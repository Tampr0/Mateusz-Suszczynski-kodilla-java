package com.my.excercise.flight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        ArrayList<String> nowaLista = flightDatabase.getCities(flightDatabase.flights);
        System.out.println(nowaLista);
    }
}
