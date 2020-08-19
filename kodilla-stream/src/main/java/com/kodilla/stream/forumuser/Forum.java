package com.kodilla.stream.forumuser;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Mateusz", 'M', LocalDate.of(1986, 04, 30), 14));
        userList.add(new ForumUser(2, "Karolina", 'F', LocalDate.of(1985, 07, 15), 5));
        userList.add(new ForumUser(3, "Zuzanna", 'F', LocalDate.of(1990, 03, 17), 8));
        userList.add(new ForumUser(4, "Mariusz", 'M', LocalDate.of(1999, 9, 5), 24));
        userList.add(new ForumUser(5, "Henryk", 'M', LocalDate.of(1970, 03, 29), 2));
        userList.add(new ForumUser(6, "Konrad", 'M', LocalDate.of(1977, 10, 9), 1));
        userList.add(new ForumUser(7, "Beata", 'F', LocalDate.of(1950, 12, 29), 8));
    }


    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
