package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }


    @Test
    public void testAddFigure(){
        Random random = new Random();
        int n = random.nextInt(3)+1;

        ShapeCollector collector = new ShapeCollector();
        Shape shape1;
        switch (n) {
            case 1:
                shape1 = new square(3.5);
                collector.addFigure(shape1);
            case 2:
                shape1 = new circle(3.5);
                collector.addFigure(shape1);
            case 3:
                shape1 = new triangle(3.5, 3.5);
                collector.addFigure(shape1);
        }
    }
    @Test
    public void testRemoveFigure(){
        Random random = new Random();
        int n = random.nextInt(3)+1;

        ShapeCollector collector = new ShapeCollector();
        Shape shape1 = new triangle(3.5, 3.5);
                collector.addFigure(shape1);

        System.out.println(collector.getSize());
        collector.removeFigure(shape1);
        System.out.println(collector.getSize());
    }
    @Test
    public void testGetFigure(){
        Random randomc = new Random();
        int c = randomc.nextInt(3)+1;

        ShapeCollector collector2 = new ShapeCollector();
        Shape shape2;
        for(int i = 0; i<100; i++) {
            switch (c) {
                case 1:
                    shape2 = new square(3.6);
                    collector2.addFigure(shape2);
                case 2:
                    shape2 = new circle(3.2);
                    collector2.addFigure(shape2);
                case 3:
                    shape2 = new triangle(3.52, 3.35);
                    collector2.addFigure(shape2);
            }
        }

        System.out.println(collector2.getFigure(50));
    }
    @Test
    public void testShowFigures(){
        Random randomc = new Random();
        int c = randomc.nextInt(3)+1;

        ShapeCollector collector2 = new ShapeCollector();
        Shape shape2;
        for(int i = 0; i<100; i++) {
            switch (c) {
                case 1:
                    shape2 = new square(3.6);
                    collector2.addFigure(shape2);
                case 2:
                    shape2 = new circle(3.2);
                    collector2.addFigure(shape2);
                case 3:
                    shape2 = new triangle(3.52, 3.35);
                    collector2.addFigure(shape2);
            }
        }

        System.out.println(collector2.showFigures());

    }

}
