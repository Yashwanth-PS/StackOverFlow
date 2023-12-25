package model;

import model.constants.UserType;

import java.util.Set;

public class User {
    private int userId;
    private String username;
    private UserType userType;
    private Set<Integer> questionsAsked;
    private Set<Integer> answersGiven;
    private Set<Integer> commentsAdded;
    private int badgeCount;

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Set<Integer> getQuestionsAsked() {
        return questionsAsked;
    }

    public Set<Integer> getAnswersGiven() {
        return answersGiven;
    }

    public Set<Integer> getCommentsAdded() {
        return commentsAdded;
    }

    public int getBadgeCount() {
        return badgeCount;
    }

}