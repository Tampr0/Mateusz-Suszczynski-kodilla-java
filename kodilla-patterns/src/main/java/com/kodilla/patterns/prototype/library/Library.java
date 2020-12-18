package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = getName() + " contains:" + "\n";
        for(Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowClone() throws CloneNotSupportedException {
        return (Library)super.clone();
    }
    public Library deepClone() throws CloneNotSupportedException {
        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();
        for(Book book : books) {
            cloneLibrary.getBooks().add(book);
        }
        return cloneLibrary;
    }
}
