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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 &&
                shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}
