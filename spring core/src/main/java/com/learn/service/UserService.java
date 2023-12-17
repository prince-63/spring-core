package com.learn.service;

public class UserService {
    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public void save(User user) {
        this.userRepository.save(user);
    }

    public void find(long userId) {
        this.userRepository.find(userId);
    }

    public void update(long userId) {
        this.userRepository.update(userId);
    }

    public void delete(long userId) {
        this.userRepository.delete(userId);
    }
}
