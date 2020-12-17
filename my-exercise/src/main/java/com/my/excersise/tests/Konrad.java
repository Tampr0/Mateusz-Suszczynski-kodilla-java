package com.my.excersise.tests;

public class Konrad {
    public static void main(String[] args) {
        System.out.println("Witaj w naszym programie!");
        System.out.println("Twój wybór: " + flight);
        System.out.println("Loty z " + flight + ":");

        Flight loty = new Flight();
        loty.loty(warszawa);

    }
}


class Flight {
    String flight;
    public Flight() {
    }

    public void loty(String flight) {
        this.flight = flight;

        if(this.flight == Warszawa  this.flight == warszawa) {

            System.out.println("loty z warszawy: ") ;
            System.out.println("Warszawa - Poznań");
            System.out.println("Warszawa - Wrocław");
            System.out.println("Warszawa - Kraków") ;
        }
        else if (this.flight == Wrocław  this.flight == wrocław) {

            System.out.println("Wrocław - Kraków");
            System.out.println("Wrocław - Warszawa");

        }
        else if (this.flight == Poznań  this.flight == poznań) {

            System.out.println("Poznań - Warszawa");
            System.out.println("Poznań - Kraków");

        }
        else if (this.flight == Kraków this.flight == kraków) {
            System.out.println("Kraków - Wrocław");
        }
        else {
            System.out.println("Przykro nam nie mamy takich lotów");
        }
    }
}

