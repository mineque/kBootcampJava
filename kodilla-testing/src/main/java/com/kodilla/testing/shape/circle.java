package com.kodilla.testing.shape;

public class circle implements Shape {
    private double r;

    public circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI*(r*r);
    }

    @Override
    public String toString() {
        return "circle{" +
                "r=" + r +
                '}';
    }
}
