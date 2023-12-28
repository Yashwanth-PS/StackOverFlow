package service;

import model.Answer;
import model.Comment;
import repository.AnswerRepository;
import repository.CommentRepository;

import java.util.HashSet;
import java.util.Set;

public class AnswerServiceImpl implements AnswerService {
    private AnswerRepository answerRepository;
    private CommentRepository commentRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository, CommentRepository commentRepository) {
        this.answerRepository = answerRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void addCommentToAnswer(int answerId, int commentId) {
        Answer answer = answerRepository.get(answerId);
        Set<Comment> comments = answer.getComments();
        if (comments == null) {
            comments = new HashSet<>();
        }
        // Assuming CommentRepository has a get method to retrieve comments by ID
        Comment comment = commentRepository.get(commentId);
        comments.add(comment);
        answerRepository.put(answer);
    }

    @Override
    public void upvoteAnswer(int answerId) {
        Answer answer = answerRepository.get(answerId);
        answer.setVotes(answer.getVotes() + 1);
        answerRepository.put(answer);
    }

    @Override
    public void flagAnswer(int answerId) {
        Answer answer = answerRepository.get(answerId);
        answer.setFlag(true);
        answerRepository.put(answer);
    }
}