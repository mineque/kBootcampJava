package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void initialiseLogger(){
        Logger.getInstance().log("Logging started");
    }

    @Test
    public void testFirstRead() {
        //Given
        //When
        String firstlog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Logging started",firstlog);

    }

    @Test
    public void testNextLogWriteAndRead() {
        //Given
        //When
        String firstlog = Logger.getInstance().getLastLog();
        Logger.getInstance().log("Really crazy stuff");
        String nextlog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Logging started",firstlog);
        Assert.assertEquals("Really crazy stuff",nextlog);

    }
}
