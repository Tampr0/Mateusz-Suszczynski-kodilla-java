package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;

    void calculateAdvStatistics(Statistics statistics) {

        double numberOfUsers = statistics.userNames().size();
        this.numberOfUsers = +numberOfUsers;

        double numberOfPosts = statistics.postsCount();
        this.numberOfPosts = +numberOfPosts;

        double numberOfComments = statistics.commentsCount();
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

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
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
