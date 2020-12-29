package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
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
    @Autowired
    private TaskDao taskDao;
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
        //taskListDao.deleteAll();

    }

    @Test
    public void testNamesQueries() {
        //given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study Native Queries", 7);
        Task task4 = new Task("Test: Makes Some Tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(120), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(250), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(100), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(140), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList("LISTNAME", "ToDo Tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //when

        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();
        List<Task> enoughTimeTask = taskDao.retrieveTaskWithEnoughTime();
        List<Task> durationLongerThanTasks = taskDao.retrieveTasksWithDurationLongerThan(6);

        //then
        try {
            Assert.assertEquals(1, longTasks.size());
            Assert.assertEquals(3, shortTasks.size());
            Assert.assertEquals(3, enoughTimeTask.size());
            Assert.assertEquals(2, durationLongerThanTasks.size());
        } finally {
//            //clean up
//            taskListDao.deleteById(id);
        }


    }
}
