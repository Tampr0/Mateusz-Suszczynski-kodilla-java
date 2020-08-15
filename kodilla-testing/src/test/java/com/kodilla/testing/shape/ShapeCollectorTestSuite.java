package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginnig of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter ++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.shapeList.contains(square);
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        shapeCollector.removeFigure(square);
        //When
        boolean result = shapeCollector.shapeList.contains(square);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        shapeCollector.addFigure(square);
        //When
        Shape retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square, retrievedShape);
    }
}

