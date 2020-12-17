package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.config.Task;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        Board board = new Board();
        board.toDoList = getToDoList();
        board.inProgressList = getInProgressList();
        board.doneList = getDoneList();
        return board;
    }

    @Bean
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList getDoneList() {
        return new TaskList();
    }

}
