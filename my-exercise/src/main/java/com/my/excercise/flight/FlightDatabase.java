package com.my.excercise.flight;

import java.util.ArrayList;

public class FlightDatabase {

    ArrayList<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Tokyo"));
        this.flights.add(new Flight("Paris", "Berlin"));
        this.flights.add(new Flight("Warsaw", "Paris"));
        this.flights.add(new Flight("Madrit", "Berlin"));
        this.flights.add(new Flight("Berlin", "Warsaw"));
        this.flights.add(new Flight("Paris", "Madrit"));
        this.flights.add(new Flight("Porto", "Warsaw"));
        this.flights.add(new Flight("Madrit", "Porto"));
        this.flights.add(new Flight("Warsaw", "Madrit"));
    }

    public ArrayList<String> getCities(ArrayList<Flight> list) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!result.contains(list.get(i).departure)) {
                result.add(list.get(i).departure);
            }
            if (!result.contains(list.get(i).arrival)) {
                result.add(list.get(i).arrival);
            }
        }
        return result;
    }

//    public ArrayList<String> getCities(ArrayList<Flight> list) {
//        ArrayList<String> result = new ArrayList<>();
//
//        for (Flight flight : list) {
//            if (!result.contains(flight.departure)) {
//                result.add(flight.departure);
//            }
//
//
//
//            if (!result.contains(list.get(i).arrival)) {
//                result.add(list.get(i).arrival);
//            }
//        }
//        return result;
//    }
}






