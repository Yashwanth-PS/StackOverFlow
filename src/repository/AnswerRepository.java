package repository;

import exception.AnswerNotFoundException;
import model.Answer;

import java.util.HashMap;
import java.util.Map;

public class AnswerRepository {
    private Map<Integer, Answer> answerMap;

    public AnswerRepository() {
        this.answerMap = new HashMap<>();
    }

    public Answer get(int answerId) {
        Answer answer = answerMap.get(answerId);
        if (answer == null) {
            throw new AnswerNotFoundException("Answer not found for : " + answerId);
        }
        return answer;
    }

    public void put(Answer answer) {
        answerMap.put(answer.getAnswerId(), answer);
    }
}
