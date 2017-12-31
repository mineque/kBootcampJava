package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> box = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape){
        this.box.add(shape);
    }
    public void removeFigure(Shape shape){
        this.box.remove(shape);
    }

    public Shape getFigure(int n){
        return this.box.get(n);
    }

    public ArrayList<Shape> showFigures(){
        return box;
    }
    public int getSize(){
        return box.size();
    }
}
