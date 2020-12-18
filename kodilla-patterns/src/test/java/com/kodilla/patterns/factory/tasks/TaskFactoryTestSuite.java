package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //When
        Assert.assertNotNull(shopping);
        Assert.assertEquals("Buying a new jeans", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertNotNull(painting);
        Assert.assertEquals("Paint the kitchen", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Then
        Assert.assertNotNull(driving);
        Assert.assertEquals("Going fast on the highway", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
