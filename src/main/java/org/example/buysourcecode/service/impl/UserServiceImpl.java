package org.example.buysourcecode.service.impl;

import org.example.buysourcecode.model.User;
import org.example.buysourcecode.repository.UserRepository;
import org.example.buysourcecode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
