package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Buying a new jeans", "jeans", 1.0);
            case PAINTING_TASK:
                return new PaintingTask("Paint the kitchen", "blue", "kitchen");
            case DRIVING_TASK:
                return new DrivingTask("Going fast on the highway", "on highway", "car");
            default:
                return null;
        }

    }
}
