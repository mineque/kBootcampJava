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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        triangle triangle = (triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        return Double.compare(triangle.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
