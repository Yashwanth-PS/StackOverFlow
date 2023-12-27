package repository;

import exception.QuestionNotFoundException;
import model.Question;

import java.util.HashMap;
import java.util.Map;

public class QuestionRepository {
    private Map<Integer, Question> questionMap;

    public QuestionRepository() {
        this.questionMap = new HashMap<>();
    }

    public Question get(int questionId) {
        Question question = questionMap.get(questionId);
        if (question == null) {
            throw new QuestionNotFoundException("Question not found for : " + questionId);
        }
        return question;
    }

    public void put(Question question) {
        questionMap.put(question.getQuestionId(), question);
    }
}
