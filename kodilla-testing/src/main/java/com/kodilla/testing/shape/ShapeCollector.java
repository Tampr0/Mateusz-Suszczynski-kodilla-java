package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape theShape = null;
        if(n >= 0 && n < shapeList.size()) {
            theShape = shapeList.get(n);
        }
        return theShape;
    }

    void showFigures(){
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }
}
