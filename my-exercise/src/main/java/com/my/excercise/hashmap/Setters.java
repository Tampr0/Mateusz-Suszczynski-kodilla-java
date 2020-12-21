package com.my.excercise.hashmap;

public class Setters {
    public static void main(String[] args) {
        TestingSetters testingSetters = new TestingSetters("Mateusz");
        System.out.println(testingSetters.testedName);
        testingSetters.setTestedName("Jonasz");
        System.out.println(testingSetters.testedName);
    }
}
class TestingSetters {
    String testedName;

    public TestingSetters(String testedName) {
        this.testedName = testedName;
    }

    public void setTestedName(String testedName) {
        this.testedName = testedName;
    }
}