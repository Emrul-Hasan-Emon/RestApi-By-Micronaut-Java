package com.example.service;

import com.example.exception.UserNotFoundException;
import com.example.model.User;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Singleton
public class UserService {
    private List<User> users = new ArrayList<>();

    public User createuser(User user) {
        this.users.add(user);
        return user;
    }

    public List<User> getAllUser() {
        return this.users;
    }

    public User getUserById(int userId) {
        return this.users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException());
    }

    private int getPosition(int userId) {
        return IntStream.range(0, this.users.size())
                .filter(idx -> this.users.get(idx).getId() == userId)
                .findFirst()
                .orElse(-1);
    }

    public User updatedUser(int id, User user) {
        this.users.set(getPosition(user.getId()), user);
        return user;
    }

    public void deleteUser(int id) {
        this.users.remove(getPosition(id));
    }
}
