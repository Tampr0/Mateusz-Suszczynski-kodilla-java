package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            Book theBook = new Book("Title " + i, "Author " + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Then
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("Zero books")).thenReturn(resultListOfBooks);
        when(libraryDatabaseMock.listBooksWithCondition("Forty books")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("Zero books");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("Forty books");
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOf10books = bookLibrary.listBookWithCondition("An");
        //Then
        assertEquals(0, theListOf10books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOfNoBooksBorrowed() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultBookList = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(resultBookList);
        //When
        List<Book> theBookList = bookLibrary.listBooksInHandsOf(any());
        //Then
        assertEquals(0, theBookList.size());
    }

    @Test
    public void testListBooksInHandsOf1BookBorrowed() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultBookList = generateListOfBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(resultBookList);
        //When
        List<Book> theBookList = bookLibrary.listBooksInHandsOf(any());
        //Then
        assertEquals(1, theBookList.size());
    }
    @Test
    public void testListBooksInHandsOf5BooksBorrowed() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultBookList = generateListOfBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(resultBookList);
        //When
        List<Book> theBookList = bookLibrary.listBooksInHandsOf(any());
        //Then
        assertEquals(5, theBookList.size());
    }
}
