package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import java.lang.*;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(" - zaczynamy alfabet", (string -> "abc" + string));
        poemBeautifier.beautify("Śpiąc robię ", (string -> string + "zzzzz"));
        poemBeautifier.beautify("wielkie litery", (string -> string.toUpperCase()));
        poemBeautifier.beautify("wszystkie e mają być duże", (string -> string.replace("e", "E")));
        poemBeautifier.beautify("X_X_", (string -> (string + string + string)));

    }
}
