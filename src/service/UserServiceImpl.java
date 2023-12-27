package service;

import model.User;
import repository.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void questionAsked(int userId, int questionId) {
        User user = userRepository.get(userId);
        user.getQuestionsAsked().add(questionId);
    }

    @Override
    public void answerGiven(int userId, int answerId) {
        User user = userRepository.get(userId);
        user.getAnswersGiven().add(answerId);
    }

    @Override
    public void commentAdded(int userId, int commentId) {
        User user = userRepository.get(userId);
        user.getCommentsAdded().add(commentId);
    }

    @Override
    public void addBadgeCount(int userId) {
        User user = userRepository.get(userId);
        user.setBadgeCount(user.getBadgeCount() + 1);
    }
}