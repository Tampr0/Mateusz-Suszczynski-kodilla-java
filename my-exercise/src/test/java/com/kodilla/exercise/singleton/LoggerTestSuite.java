package com.kodilla.exercise.singleton;

import com.my.excercise.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
        Logger.getInstance().log("log from April");
    }

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("log from May");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertNotEquals("log from April", lastLog);
        Assert.assertEquals("log from May", lastLog);
    }
}
