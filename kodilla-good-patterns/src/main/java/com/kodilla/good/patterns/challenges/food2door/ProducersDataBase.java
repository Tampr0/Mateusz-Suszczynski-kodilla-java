package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;
import java.util.stream.Collectors;

public class ProducersDataBase {
    public static void main(String[] args) {
        CollectionCreator listCreator = new CollectionCreator();

    }
}
class MethodsToPractice {
    public static void iterateMe(ArrayList<String> theList) {
        for (String book : theList) {
            System.out.println(book);
        }
    }
    public static String allListInOneLine(ArrayList<String> theList) {
        String napis = theList.stream()
                .collect(Collectors.joining());
        return napis;
    }
}
class Employee {}
class SalaryParameters {}
class CollectionCreator {


    public Map<Employee, SalaryParameters> hashMapCreator() {
        Map<Employee, SalaryParameters> paymentParameters = new HashMap<Employee, SalaryParameters>();
        return paymentParameters;
    }
    public ArrayList<String> arrayList() {
        ArrayList<String> library = new ArrayList<String>();
        library.add("50 Shades of Grey");
        library.add("Sherlock Holmes");
        library.add("The Last of the Mohicans");
        library.add("The Infinity");
        library.add("Better Call Saul");
        library.add("Journey to the Center of the Earth");
        library.add("Binary Death");
        library.add("Breaking Bad");
        library.add("Twenty Thousand Leagues Under the Sea");
        library.add("The Titanfall");
        library.add("Coma");
        library.add("Of Ants and Men");
        library.add("To Understand a Woman");
        library.add("Neverending Story");
        library.add("The Jungle Book");
        return library;
    }
}






  //  Map<Integer, String> producersMap;
//
//    public ProducersDataBase() {
//        this.producersMap = new HashMap<Integer, String>();
//    }
//    public boolean addProducer(Producer producer) {
//        return true;
//    }
//    public void removeProducer(Producer producer) {
//    }
