package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping list", "Palace", 10);
            case PAINTING:
                return new PaintingTask("Paint it", "yellow", "grass");
            case DRIVING:
                return new DrivingTask("Visit president immediately", "Warsaw", "Boots");
            default:
                return null;
        }
    }
}
