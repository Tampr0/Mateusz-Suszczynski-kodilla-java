package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> userNames(); // list of user names
    int postsCount();           //number of forum posts
    int commentsCount();        //number of comments
}
