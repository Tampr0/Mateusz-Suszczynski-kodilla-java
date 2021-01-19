package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("JK Rowling", "Harry Potter", 2010, "1"));
        books.add(new Book("Tomas Harris", "Get Lucky", 1815, "2"));
        books.add(new Book("Stephen King", "It", 1986, "3"));
        books.add(new Book("George Lucas", "Star Wars", 2012, "4"));
        books.add(new Book("Tomas Riddle", "Never Ending Story", 1999, "5"));
        books.add(new Book("Lucas Andree", "Night Before Darkness", 2010, "6"));
        books.add(new Book("Mary Luise", "Never Say Never", 1888, "7"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int result = medianAdapter.publicationYearMedian(books);
        //then
        System.out.println(result);
        Assert.assertEquals(1999, result, 0);

    }
}
