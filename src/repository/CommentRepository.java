package repository;

import exception.CommentNotFoundException;
import model.Comment;

import java.util.HashMap;
import java.util.Map;

public class CommentRepository {
    private Map<Integer, Comment> commentMap;

    public CommentRepository() {
        this.commentMap = new HashMap<>();
    }

    public Comment get(int commentId) {
        Comment comment = commentMap.get(commentId);
        if (comment == null) {
            throw new CommentNotFoundException("Comment not found for : " + commentId);
        }
        return comment;
    }

    public void put(Comment comment) {
        commentMap.put(comment.getCommentId(), comment);
    }
}
