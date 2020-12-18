package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mark = new Millenials("Markus Newman");
        User gwyneth = new YGeneration("Gwyneth Paltrow");
        User tom = new ZGeneration("Tom Cruise");

        //When
        String marksPost = mark.sharePost();
        System.out.println("\n" + marksPost + "\n");
        String gwynethsPost = gwyneth.sharePost();
        System.out.println(gwynethsPost + "\n");
        String tomsPost = tom.sharePost();
        System.out.println(tomsPost + "\n");

        //Then

        Assert.assertEquals("Markus Newman shares post on Facebook:", marksPost);
        Assert.assertEquals("Gwyneth Paltrow shares post on Snapchat:", gwynethsPost);
        Assert.assertEquals("Tom Cruise shares post on Twitter:", tomsPost);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mark = new Millenials("Markus Newman");

        //When
        String marksPost = mark.sharePost();
        System.out.println("\n" + marksPost + "\n");
        mark.setSocialPublisher(new TwitterPublisher());
        marksPost = mark.sharePost();
        System.out.println(marksPost + "\n");

        //Then
        Assert.assertEquals("Markus Newman shares post on Twitter:", marksPost);

    }
}
