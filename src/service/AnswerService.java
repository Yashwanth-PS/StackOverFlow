package service;

public interface AnswerService {
    void addCommentToAnswer(int answerId, int commentId);

    void upvoteAnswer(int answerId);

    void flagAnswer(int answerId);
}