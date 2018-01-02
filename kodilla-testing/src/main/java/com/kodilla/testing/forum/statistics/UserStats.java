package com.kodilla.testing.forum.statistics;

public class UserStats {

    private int usersCounter;
    private int postCounter;
    private int commentsCounter;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public UserStats() {
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.usersCounter = statistics.usersNames().size();
        this.postCounter = statistics.postsCount();
        this.commentsCounter = statistics.commentsCount();

        if(this.postCounter == 0) {
            this.avgCommentPerPost = 0;
        } else {
            this.avgCommentPerPost = (double) this.commentsCounter / (double) this.postCounter;
        }

        if(this.usersCounter == 0) {
            this.avgPostPerUser = 0;
            this.avgCommentPerUser = 0;
        } else {
            this.avgPostPerUser = (double) this.postCounter / (double) this.usersCounter;
            this.avgCommentPerUser = (double) this.commentsCounter / (double) this.usersCounter;
        }
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    //Instead ShowStatistics()
    @Override
    public String toString() {
        return "UserStats{" +
                "usersCounter=" + usersCounter +
                ", postCounter=" + postCounter +
                ", commentsCounter=" + commentsCounter +
                ", avgPostPerUser=" + avgPostPerUser +
                ", avgCommentPerUser=" + avgCommentPerUser +
                ", avgCommentPerPost=" + avgCommentPerPost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserStats userStats = (UserStats) o;

        if (usersCounter != userStats.usersCounter) return false;
        if (postCounter != userStats.postCounter) return false;
        if (commentsCounter != userStats.commentsCounter) return false;
        if (Double.compare(userStats.avgPostPerUser, avgPostPerUser) != 0) return false;
        if (Double.compare(userStats.avgCommentPerUser, avgCommentPerUser) != 0) return false;
        return Double.compare(userStats.avgCommentPerPost, avgCommentPerPost) == 0;
    }

}
