package service;

import model.Comment;
import repository.CommentRepository;

public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void upvoteComment(int commentId) {
        Comment comment = commentRepository.get(commentId);
        comment.setVotes(comment.getVotes() + 1);
        commentRepository.put(comment);
    }

    @Override
    public void flagComment(int commentId) {
        Comment comment = commentRepository.get(commentId);
        comment.setFlag(true);
        commentRepository.put(comment);
    }
}
