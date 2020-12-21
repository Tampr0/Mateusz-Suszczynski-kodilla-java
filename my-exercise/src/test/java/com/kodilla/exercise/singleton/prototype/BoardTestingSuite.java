package com.kodilla.exercise.singleton.prototype;

import com.my.excercise.prototype.Board;
import com.my.excercise.prototype.Task;
import com.my.excercise.prototype.TasksList;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestingSuite {
    @Test
    public void testToString() {
        //Given  Task task ----> TasksList -> ArrayList<Task> tasksList ----> Board -> HashSet<TasksList> lists
        //creating a task list for todos
        TasksList listToDo = new TasksList("To Do Tasks");
        for (int i = 0; i >= 10; i++) {
            listToDo.getTasks().add(new Task("To Do task number " + i));
        }
        // creating a task list for in Progress
        TasksList listInProgress = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress task number " + n)));

        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done task number" + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);
        System.out.println(board);
        //When
        //Then
        Assert.assertEquals(3, board.getLists().size());
    }

}
