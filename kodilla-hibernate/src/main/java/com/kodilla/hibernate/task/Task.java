package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "from Task where duration > 10"
        ),
        @NamedQuery(
                name = "Task.retrieveShortTasks",
                query = "from Task where duration <= 10"
                ),
        @NamedQuery(
                name = "Task.retrieveTasksWithDurationLongerThan",
                query = "from Task where duration > :duration"
        )
})

@NamedNativeQuery(
        name = "Task.retrieveTaskWithEnoughTime",
        query = "select * from tasks" +
                " where datediff(date_add(created, interval duration day), now()) > 5",
        resultClass = Task.class
)

@Entity
@Table (name = "TASKS")
public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task(String description, int duration) {
        this.description = description;
        this.duration = duration;
        this.created = new Date();
    }

    public Task() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column (name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column (name = "CREATED")
    public Date getCreated() {
        return created;
    }
    @Column (name = "DURATION")
    public int getDuration() {
        return duration;
    }
    @OneToOne(cascade = CascadeType.ALL,
                fetch = FetchType.EAGER)
    @JoinColumn(name = "TASK_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }
    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}
