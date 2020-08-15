package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {


    String shapeName;
    double field;

    public Square(double sideLength) {
        this.shapeName = "square";
        this.field = sideLength * sideLength;
    }
    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        return this.field;
    }
}
