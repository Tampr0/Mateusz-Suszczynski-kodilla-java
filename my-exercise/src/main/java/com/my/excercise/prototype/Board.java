package com.my.excercise.prototype;

import java.util.HashSet;
import java.util.Set;

public class Board extends Prototype {
    private String name;
    final private Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }
    public Board clone() throws CloneNotSupportedException {
        return (Board)super.clone();
    }
}
