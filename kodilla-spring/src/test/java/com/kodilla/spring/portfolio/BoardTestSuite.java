package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add(0, "Zdanie numer 1 z listy toDoList");
        board.inProgressList.tasks.add(0, "Zdanie numer 2 z listy inProgressList");
        board.doneList.tasks.add(0, "Zdanie numer 3 z listy doneList");
        //Then
        Assert.assertEquals("Zdanie numer 1 z listy toDoList", board.toDoList.tasks.get(0));
        Assert.assertEquals("Zdanie numer 2 z listy inProgressList", board.inProgressList.tasks.get(0));
        Assert.assertEquals("Zdanie numer 3 z listy doneList", board.doneList.tasks.get(0));
        }

//
//

}
