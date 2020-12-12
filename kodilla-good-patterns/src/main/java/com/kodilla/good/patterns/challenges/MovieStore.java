package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class MovieStore {
    public final Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> bookTitlesWithTranslations = new HashMap<>();
        bookTitlesWithTranslations.put("IM", ironManTranslations);
        bookTitlesWithTranslations.put("AV", avengersTranslations);
        bookTitlesWithTranslations.put("FL", flashTranslations);

        return bookTitlesWithTranslations;
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String allTitles = movieStore.getMovies().entrySet().stream()
                .flatMap(list -> list.getValue().stream())
                .collect(Collectors.joining("! "));
        System.out.println(allTitles);
    }
}
