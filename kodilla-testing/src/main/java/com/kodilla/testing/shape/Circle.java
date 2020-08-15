package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    String shapeName;
    double field;
    public Circle(double radius) {
        this.shapeName = "circle";
        this.field = Math.PI * Math.pow(radius, 2);
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
