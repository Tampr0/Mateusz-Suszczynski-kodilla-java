package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;

    void calculateAdvStatistics(Statistics statistics) {

        int numberOfUsers = statistics.userNames().size();
        this.numberOfUsers = +numberOfUsers;

        int numberOfPosts = statistics.postsCount();
        this.numberOfPosts = +numberOfPosts;

        int numberOfComments = statistics.commentsCount();
        this.numberOfComments = +numberOfComments;

        if (numberOfUsers > 0) {
            double averageOfPostsPerUser = numberOfPosts / numberOfUsers;
            this.averageOfPostsPerUser = averageOfPostsPerUser;
            double averageOfCommentsPerUser = numberOfComments / numberOfUsers;
            this.averageOfCommentsPerUser = averageOfCommentsPerUser;
        }
        if (numberOfPosts > 0) {
            double averageOfCommentsPerPost = numberOfComments / numberOfPosts;
            this.averageOfCommentsPerPost = averageOfCommentsPerPost;
        }
    }
    void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average of posts per user: " + averageOfPostsPerUser);
        System.out.println("Average of comments per user: " + averageOfCommentsPerUser);
        System.out.println("Average of comments per post: " + averageOfCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageOfPostsPerUser() {
        return averageOfPostsPerUser;
    }

    public double getAverageOfCommentsPerUser() {
        return averageOfCommentsPerUser;
    }

    public double getAverageOfCommentsPerPost() {
        return averageOfCommentsPerPost;
    }
}
