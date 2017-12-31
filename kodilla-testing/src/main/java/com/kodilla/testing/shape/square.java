package com.kodilla.testing.shape;

public class square implements Shape {
    private double a;

    public square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return a*a;
    }

    @Override
    public String toString() {
        return "square{" +
                "a=" + a +
                '}';
    }
}
