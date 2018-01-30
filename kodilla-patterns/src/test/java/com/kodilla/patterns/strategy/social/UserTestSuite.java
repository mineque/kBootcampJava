package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test

    public void testDefaultSharingStrategies(){
        //GIVEN
        Millenials mil = new Millenials("Twitek");
        ZGeneration zetek = new ZGeneration("Snapek");
        YGeneration ygrek = new YGeneration("Facik");
        //WHEN


        //THEN
        Assert.assertEquals("Shared on Twitter", mil.sharePost());
        Assert.assertEquals("Shared on SnapChat", zetek.sharePost());
        Assert.assertEquals("Shared on Facebook", ygrek.sharePost());
    }


    @Test
    public void testIndividualSharingStrategy(){

        //GIVEN
        Millenials mil = new Millenials("Twitek");
        ZGeneration zetek = new ZGeneration("Snapek");
        YGeneration ygrek = new YGeneration("Facik");
        //WHEN
        String mil1 = mil.sharePost();
        mil.setPublisher(new FacebookPublisher());

        String zetek1 = zetek.sharePost();
        zetek.setPublisher(new FacebookPublisher());

        String ygrek1 = ygrek.sharePost();
        ygrek.setPublisher(new TwitterPublisher());



        //THEN
        Assert.assertEquals("Shared on Twitter", mil1);
        Assert.assertEquals("Shared on Facebook", mil.sharePost());

        Assert.assertEquals("Shared on SnapChat", zetek1);
        Assert.assertEquals("Shared on Facebook", zetek.sharePost());

        Assert.assertEquals("Shared on Facebook", ygrek1);
        Assert.assertEquals("Shared on Twitter", ygrek.sharePost());
    }
}
