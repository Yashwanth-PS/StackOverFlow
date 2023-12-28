package service;

import model.Answer;
import model.Question;

import java.util.List;

public interface QuestionService {
    List<Question> searchQuestions(String query);

    Question viewQuestion(int questionId);

    void addQuestion(Question question);

    void upvoteQuestion(int questionId);

    void addAnswerToOpenQuestion(int questionId, int answerId);

    void addCommentToQuestion(int questionId, int commentId);

    void flagQuestion(int questionId);

    void addBountyToQuestion(int questionId, int bountyValue);

    void voteToCloseQuestion(int questionId);

    void closeQuestion(int questionId);

    void reOpenQuestion(int questionId);

    void addTagToQuestion(int questionId, String tag);

    void voteToDeleteQuestion(int questionId);

    void deleteQuestion(int questionId);

    void unDeleteQuestion(int questionId);
}
