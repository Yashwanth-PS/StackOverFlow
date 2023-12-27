package service;

import model.User;

public interface UserService {
    void questionAsked(int userId, int questionId);

    void answerGiven(int userId, int answerId);

    void commentAdded(int userId, int commentId);

    void addBadgeCount(int userId);
}