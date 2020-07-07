package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> testList = new OddNumbersExterminator().exterminate(emptyList);
        System.out.println("Testing: " + testList);
        //Then
        Assert.assertEquals(emptyList, testList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i++) {
            normalList.add(i);
        }
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i++) {
            if ((i % 2) == 0) {
                oddList.add(i);
            }
        }
        //When
        ArrayList<Integer> testList = new OddNumbersExterminator().exterminate(normalList);
        System.out.println("Testing: " + testList);
        //Then
        Assert.assertEquals(testList, oddList);

    }



}
