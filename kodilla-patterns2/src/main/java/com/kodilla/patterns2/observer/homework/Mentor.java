package com.kodilla.patterns2.observer.homework;

public class Mentor implements QueueObserver {
    private final String mentorName;
    private int updateCount = 0;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        if (taskQueue.getTaskList().size() <= 1) {
            System.out.println(mentorName + ", you have " + taskQueue.getTaskList().size()
                    + " new task from " + taskQueue.getStudentName());
        } else {
            System.out.println(mentorName + ", you have " + taskQueue.getTaskList().size()
                    + " new tasks from " + taskQueue.getStudentName());
        }
        System.out.println("=========" + taskQueue.getStudentName()+ " TASKS LIST=========");
        for (String task : taskQueue.getTaskList()) {
            System.out.println(task);
        }
        System.out.println();
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
