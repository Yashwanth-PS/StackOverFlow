package model;

import java.util.Set;

public class Comment {
    private int commentId;
    private String content;
    private int votes;
    private Set<Integer> flags;

    // Getters and setters

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

    public Set<Integer> getFlags() {
        return flags;
    }

    public void setFlags(Set<Integer> flags) {
        this.flags = flags;
    }
}