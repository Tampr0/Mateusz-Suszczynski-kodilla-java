package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.tasklist.dao.TaskListDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {
        //given
        TaskList taskList = new TaskList("List number 1", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //when
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        //then
        Assert.assertEquals(1, readTaskList.size());
        //cleanup
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
    @Test
    public void testTaskListDaoSaveWithTasks() {
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some enities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(340), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(200), true);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("List number 1", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //when
        taskListDao.save(taskList);
        int id = taskList.getId();

        //then
        //Assert.assertNotEquals(0, id);

        //cleanup
        taskListDao.deleteAll();

    }
}
