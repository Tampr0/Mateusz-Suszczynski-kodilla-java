package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    String shapeName;
    double field;

    public Triangle(double base, double height) {
        this.shapeName = "triangle";
        this.field = base * height;
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
