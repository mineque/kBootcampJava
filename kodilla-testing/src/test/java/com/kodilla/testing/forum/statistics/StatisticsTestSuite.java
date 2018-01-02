package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testAverageWhenZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);

        UserStats stats = new UserStats();
        //When

        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, stats.getAvgCommentPerPost(), 1);
        Assert.assertEquals(0, stats.getAvgCommentPerUser(), 1);
        Assert.assertEquals(0, stats.getAvgPostPerUser(), 1);
    }

    @Test
    public void testAverageWhen0_10() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("John Doe");
        usersList.add("Doe John");
        usersList.add("John Smith");
        usersList.add("Smith John");
        usersList.add("Jane Doe");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);

        UserStats stats = new UserStats();
        //When

        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, stats.getAvgCommentPerPost(), 1);
        Assert.assertEquals(20, stats.getAvgCommentPerUser(), 1);
        Assert.assertEquals(2, stats.getAvgPostPerUser(), 1);
    }
}
