package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue johnSmithTaskQueue = new TaskQueue("John Smith");
        TaskQueue mateuszSuszczynskiTaskQueue = new TaskQueue("Mateusz Suszczyński");
        TaskQueue bruceLeeTaskQueue = new TaskQueue("Bruce Lee");

        Mentor jacekWioslo = new Mentor("Jacek Wiosło");
        Mentor zbigniewStodola = new Mentor("Zbigniew Stodoła");

        johnSmithTaskQueue.registerMentor(jacekWioslo);
        mateuszSuszczynskiTaskQueue.registerMentor(jacekWioslo);
        bruceLeeTaskQueue.registerMentor(zbigniewStodola);
        //when
        johnSmithTaskQueue.addTask("Task 1 - while loop");
        johnSmithTaskQueue.addTask("Task 2 - for loop");
        mateuszSuszczynskiTaskQueue.addTask("Task 1 - while loop");
        johnSmithTaskQueue.addTask("Task 3 - optional");
        bruceLeeTaskQueue.addTask("Task 1 - while loop");
        bruceLeeTaskQueue.addTask("Task 2 - for loop");
        mateuszSuszczynskiTaskQueue.addTask("Task 2 - for loop");
        //then
        Assert.assertEquals(5, jacekWioslo.getUpdateCount());
        Assert.assertEquals(2, zbigniewStodola.getUpdateCount());

    }
}
