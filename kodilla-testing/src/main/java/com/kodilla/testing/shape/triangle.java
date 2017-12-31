package com.kodilla.testing.shape;

public class triangle implements Shape {
    private double a;
    private double h;

    public triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return (1/2*(a*h));
    }

    @Override
    public String toString() {
        return "triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }
}
