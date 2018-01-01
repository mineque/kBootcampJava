package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        OddNumbersExterminator ex = new OddNumbersExterminator();
        ArrayList<Integer> Ints = new ArrayList<Integer>();
        //when
        List<Integer> result = ex.exterminate(Ints);
        //then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        OddNumbersExterminator ex = new OddNumbersExterminator();
        ArrayList<Integer> Ints = new ArrayList<Integer>();
        for(int i = 0; i<101; i++){
            Ints.add(i);
        }
        //when
        List<Integer>  result = ex.exterminate(Ints);
        //then
        Assert.assertEquals(50, result.size());
    }
}
