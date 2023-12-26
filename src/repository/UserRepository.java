package repository;

import exception.UserNotFoundException;
import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<Integer, User> userMap;

    public UserRepository() {
        this.userMap = new HashMap<>();
    }

    public User get(int userId) {
        User user = userMap.get(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found for : " + userId);
        }
        return user;
    }

    public void put(User user) {
        userMap.put(user.getUserId(), user);
    }
}
