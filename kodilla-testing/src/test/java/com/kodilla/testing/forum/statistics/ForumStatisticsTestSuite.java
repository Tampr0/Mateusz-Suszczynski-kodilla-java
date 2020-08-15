package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.mockito.Mockito.mock;

public class ForumStatisticsTestSuite {
    @Test //number of posts 0
    public void calculateAdvStatisticsTestNb1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageOfPostsPerUser = forumStatistics.getAverageOfPostsPerUser();
        double averageOfCommentsPerUser = forumStatistics.getAverageOfCommentsPerUser();
        double averageOfCommentsPerPost = forumStatistics.getAverageOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageOfPostsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerPost, 0);

    }
    @Test //number of posts 1000,
    public void calculateAdvStatisticsTestNb2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageOfPostsPerUser = forumStatistics.getAverageOfPostsPerUser();
        double averageOfCommentsPerUser = forumStatistics.getAverageOfCommentsPerUser();
        double averageOfCommentsPerPost = forumStatistics.getAverageOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageOfPostsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerPost, 0);

    }
    @Test //number of comments 0
    public void calculateAdvStatisticsTestNb3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageOfPostsPerUser = forumStatistics.getAverageOfPostsPerUser();
        double averageOfCommentsPerUser = forumStatistics.getAverageOfCommentsPerUser();
        double averageOfCommentsPerPost = forumStatistics.getAverageOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageOfPostsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerPost, 0);

    }
    @Test //number of comments < posts, method averageOfPostsPerUser will not execute, can not divide by 0
    public void calculateAdvStatisticsTestNb4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageOfPostsPerUser = forumStatistics.getAverageOfPostsPerUser();
        double averageOfCommentsPerUser = forumStatistics.getAverageOfCommentsPerUser();
        double averageOfCommentsPerPost = forumStatistics.getAverageOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageOfPostsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerUser, 0);
        Assert.assertEquals(0 , averageOfCommentsPerPost, 0);

    }

    //number of comments > number of posts
    //methods averageOfPostsPerUser and getAverageOfCommentsPerUser will not execute, can not divide by 0
    @Test
    public void calculateAdvStatisticsTestNb5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(2);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageOfPostsPerUser = forumStatistics.getAverageOfPostsPerUser();
        double averageOfCommentsPerUser = forumStatistics.getAverageOfCommentsPerUser();
        double averageOfCommentsPerPost = forumStatistics.getAverageOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageOfPostsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerUser, 0);
        Assert.assertEquals(2, averageOfCommentsPerPost, 0);

    }

    @Test // number of users 0
    public void calculateAdvStatisticsTestNb6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageOfPostsPerUser = forumStatistics.getAverageOfPostsPerUser();
        double averageOfCommentsPerUser = forumStatistics.getAverageOfCommentsPerUser();
        double averageOfCommentsPerPost = forumStatistics.getAverageOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageOfPostsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerPost, 0);
    }
    @Test //number of users 100
    public void calculateAdvStatisticsTestNb7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNames.add("User " + i);
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageOfPostsPerUser = forumStatistics.getAverageOfPostsPerUser();
        double averageOfCommentsPerUser = forumStatistics.getAverageOfCommentsPerUser();
        double averageOfCommentsPerPost = forumStatistics.getAverageOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageOfPostsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerUser, 0);
        Assert.assertEquals(0, averageOfCommentsPerPost, 0);

    }


}
