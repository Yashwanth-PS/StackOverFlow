package model;

import java.util.Set;

public class Answer {
    private int answerId;
    private String content;
    private int votes;
    private boolean flag;
    private Set<Comment> comments;

    // Getters and Setters

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean getFlags() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Set<Comment> getComments() {
        return comments;
    }
}