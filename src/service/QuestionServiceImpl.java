package service;

import model.Question;
import repository.QuestionRepository;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> searchQuestions(String query) {
        // Implement search logic based on the provided query
        return questionRepository.searchQuestions(query);
    }

    @Override
    public Question viewQuestion(int questionId) {
        return questionRepository.get(questionId);
    }

    @Override
    public void addQuestion(Question question) {
        questionRepository.put(question);
    }

    @Override
    public void upvoteQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        question.setVotes(question.getVotes() + 1);
        questionRepository.put(question);
    }

    @Override
    public void addAnswerToOpenQuestion(int questionId, int answerId) {
        Question question = questionRepository.get(questionId);
        question.setAnswerId(answerId);
        questionRepository.put(question);
    }

    @Override
    public void addCommentToQuestion(int questionId, int commentId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.addComment(commentId);
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for adding comment: " + questionId);
        }
    }

    @Override
    public void flagQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.flag();
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for flagging: " + questionId);
        }
    }

    @Override
    public void addBountyToQuestion(int questionId, int bountyValue) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.addBounty(bountyValue);
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for adding bounty: " + questionId);
        }
    }

    @Override
    public void voteToCloseQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.voteToClose();
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for voting to close: " + questionId);
        }
    }

    @Override
    public void closeQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.close();
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for closing: " + questionId);
        }
    }

    @Override
    public void reOpenQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.reOpen();
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for reopening: " + questionId);
        }
    }

    @Override
    public void addTagToQuestion(int questionId, String tag) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.addTag(tag);
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for adding tag: " + questionId);
        }
    }

    @Override
    public void voteToDeleteQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.voteToDelete();
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for voting to delete: " + questionId);
        }
    }

    @Override
    public void deleteQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.delete();
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for deletion: " + questionId);
        }
    }

    @Override
    public void unDeleteQuestion(int questionId) {
        Question question = questionRepository.get(questionId);
        if (question != null) {
            question.unDelete();
            questionRepository.updateQuestion(question);
        } else {
            // Handle question not found error
            throw new IllegalArgumentException("Question not found for undeletion: " + questionId);
        }
    }
}
