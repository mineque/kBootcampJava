package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShopping(){
        //GIVEN
        TaskFactory shopFactory = new TaskFactory();
        //WHEN
        Task shoppy = shopFactory.makeTask("SHOPPING");
        shoppy.executeTask();
        //THEN
        Assert.assertEquals(true,shoppy.isTaskExecuted());
        Assert.assertEquals("Shopping list",shoppy.getTaskName());
    }
    @Test
    public void testPainting(){
        //GIVEN
        TaskFactory paintFactory = new TaskFactory();
        //WHEN
        Task bucket = paintFactory.makeTask("PAINTING");
        bucket.executeTask();
        //THEN
        Assert.assertEquals(true,bucket.isTaskExecuted());
        Assert.assertEquals("Paint it",bucket.getTaskName());
    }
    @Test
    public void testDriving(){
        //GIVEN
        TaskFactory carFactory = new TaskFactory();
        //WHEN
        Task driver = carFactory.makeTask("DRIVING");
        driver.executeTask();
        //THEN
        Assert.assertEquals(true,driver.isTaskExecuted());
        Assert.assertEquals("Visit president immediately",driver.getTaskName());
    }

}
