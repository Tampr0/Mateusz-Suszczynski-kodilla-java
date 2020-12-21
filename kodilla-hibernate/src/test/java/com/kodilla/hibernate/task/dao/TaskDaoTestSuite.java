package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.format.DecimalStyle;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        //When
        taskDao.save(task);
        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assert.assertTrue(readTask.isPresent());
        //Clean up
        taskDao.deleteById(id);
    }
    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        //when
        taskDao.save(task);
        //then
        int dur = task.getDuration();
        List<Task> readTask = taskDao.findByDuration(dur);
        Assert.assertEquals(5, readTask.size());
        //clean up
        taskDao.deleteAll();

    }


}
