package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given

        Library library = new Library("Library of Wrocław");

        library.getBooks().add(new Book("Wiedźmin", "Sapkowski", LocalDate.of(1980, 4, 18)));
        library.getBooks().add(new Book("Władca Pierścieni", "Tolkien", LocalDate.of(1956, 5, 20)));
        library.getBooks().add(new Book("To", "King", LocalDate.of(2000, 1, 5)));
        library.getBooks().add(new Book("Matematyka", "Autor nieznany", LocalDate.of(2019, 12, 1)));
        library.getBooks().add(new Book("Geografia", "Pani od Geografii", LocalDate.of(1888, 4, 19)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowClone();
            clonedLibrary.setName("Library of Warsaw");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepClone();
            deepClonedLibrary.setName("Library of Kraków");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().removeAll(library.getBooks());

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
