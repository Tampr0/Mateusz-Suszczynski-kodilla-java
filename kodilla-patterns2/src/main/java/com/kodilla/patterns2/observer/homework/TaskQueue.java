package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements QueueObservable {
    private final String studentName;
    private final List<String> taskList;
    private final List<QueueObserver> queueObservers;

    public TaskQueue(String studentName) {
        this.studentName = studentName;
        this.taskList = new ArrayList<>();
        this.queueObservers = new ArrayList<>();
    }

    public void addTask(String task) {
        taskList.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(QueueObserver queueObserver) {
        queueObservers.add(queueObserver);
    }

    @Override
    public void notifyMentors() {
        for (QueueObserver queueObserver : queueObservers) {
            queueObserver.update(this);
        }

    }

    @Override
    public void removeMentor(QueueObserver queueObserver) {

    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
