package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static String DESCRIPTION = "Test: isSendedProperly";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Tested List Name", DESCRIPTION);
        taskListDao.save(taskList);
        //When
        List<TaskList> listofListNames = taskListDao.findByListName(taskList.getListName());
        //Then
        Assert.assertEquals(1, listofListNames.size());
        //Clean up
        taskListDao.deleteAll();
    }
}
