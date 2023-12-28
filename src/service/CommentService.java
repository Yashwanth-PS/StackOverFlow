package service;

public interface CommentService {
    void upvoteComment(int commentId);

    void flagComment(int commentId);
}