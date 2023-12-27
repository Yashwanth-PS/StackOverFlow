package model;

import model.constants.QuestionType;

public class Question {
    private int questionId;
    private String content;
    private QuestionType questionType;
    private boolean flagged;
    private boolean hasBounty;
    private int votes;
    private int votesToClose;
    private String tag;
    private int votesToDelete;

    // Getters and Setters

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public boolean hasBounty() {
        return hasBounty;
    }

    public void setHasBounty(boolean hasBounty) {
        this.hasBounty = hasBounty;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getVotesToClose() {
        return votesToClose;
    }

    public void setVotesToClose(int votesToClose) {
        this.votesToClose = votesToClose;
    }

    public String getTag() {
        return tag;
    }

    public void setTags(String tag) {
        this.tag = tag;
    }

    public int getVotesToDelete() {
        return votesToDelete;
    }

    public void setVotesToDelete(int votesToDelete) {
        this.votesToDelete = votesToDelete;
    }
}