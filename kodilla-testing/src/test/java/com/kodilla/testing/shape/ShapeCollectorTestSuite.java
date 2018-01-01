package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
        //given
        ShapeCollector collector = new ShapeCollector();
        Shape shape1 = new triangle(3.5, 3.5);
        //when
        collector.addFigure(shape1);
        //then
        Assert.assertEquals(shape1,collector.getFigure(0));
    }
    @Test
    public void testRemoveFigure(){
        //given
        ShapeCollector collector = new ShapeCollector();
        Shape shape1 = new triangle(3.5, 3.5);
        collector.addFigure(shape1);
        //when
        collector.removeFigure(shape1);
        //then
        Assert.assertEquals(0,collector.getSize());

    }
    @Test
    public void testGetFigure(){
        //given
        ShapeCollector collector2 = new ShapeCollector();
        Shape shape2 = new triangle(3.52, 3.35);
        collector2.addFigure(shape2);
        //when
        Shape result = collector2.getFigure(0);
        //then
        Assert.assertEquals(shape2,result);
    }

}
