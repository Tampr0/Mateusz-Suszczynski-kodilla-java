package com.my.excercise.hashmap;

public class Key {
    String firstName;
    String lastName;
    String peselId;

    public Key(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    @Override
    public boolean equals(Object o) {
        Key e = (Key) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId);
    }
}
