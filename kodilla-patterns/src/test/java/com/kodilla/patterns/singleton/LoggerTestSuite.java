package com.kodilla.patterns.singleton;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void setLog() {
        Logger.getInstance().log("Log nr 001");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Log nr 002");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log nr 002", lastLog);
    }
}
