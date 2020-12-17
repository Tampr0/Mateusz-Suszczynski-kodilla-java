package com.kodilla.good.patterns.challenges.flight;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchEngine {

    private FlightDataBase flightDataBase;
    private HashSet<Flight> flightList = this.flightDataBase.getTheFlightList();

    public FlightSearchEngine(FlightDataBase flightDataBase) {
        this.flightDataBase = flightDataBase;
    }

    public void findDeparture(String departure) {
        this.flightList.stream()
                .filter(flight -> flight.getDeparture() == departure)
                .map(flight -> flight.toString())
                .forEach(System.out::println);
    }
    public void findArrival(String arrival) {
        this.flightList.stream()
                .filter(flight -> flight.getArrival() == arrival)
                .map(flight -> flight.toString())
                .forEach(System.out::println);

    }

    public String flightToCityWithTransfer(String departure, String arrival, String transfer) {
        System.out.println("These are all flights from " + departure + " to " + arrival + " through " + transfer);
        String result = this.flightList.stream()
                .filter(flight -> (flight.getDeparture() == departure && flight.getArrival() == transfer)
                        || (flight.getDeparture() == transfer && flight.getArrival() == arrival))
                .map(flight -> flight.toString())
                .collect(Collectors.joining(" -> "));
        return result;
    }

//    public List<Flight> flightToCityWithTransfer(String departureAirport, String transferAirport,  String arrivalAirport){
//
//        List<Flight> departureTransfer = this.flightList.stream()
//                .filter(d -> d.getDeparture().equals(departureAirport))
//                .filter(a -> a.getArrival().equals(transferAirport))
//                .collect(Collectors.toList());
//
//        List<Flight> transferArrival = this.flightList.stream()
//                .filter(d -> d.getDeparture().equals(transferAirport))
//                .filter(a -> a.getArrival().equals(arrivalAirport))
//                .collect(Collectors.toList());
//
//        return Stream.concat(departureTransfer.stream(), transferArrival.stream())
//                .collect(Collectors.toList());
//
//    }


//    public void flightThrough(String departure, String arrival) {
//        System.out.println("These are all flights from " + departure + " to " + arrival);
//        List<Flight> theList = this.flightList.stream()
//                .filter(flight -> (flight.getDeparture() == departure || flight.getArrival() == arrival))
//                        //|| ((flight.getDeparture() == departure || flight.getArrival() == arrival)))
//
//                        //&& (flight.getDeparture() == flight.getArrival())))
//                //.filter(flight -> (flight.getArrival() == flight.getDeparture()))
//                .collect(Collectors.toList());
//        theList.stream()
//                .filter()
//    }

    //Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia



    //Firma zna się na technologiach i wymaga użycia iteracji za pomocą Stream oraz spodziewa
    // się wykorzystania kontraktu Equals i Hashcode.


}
