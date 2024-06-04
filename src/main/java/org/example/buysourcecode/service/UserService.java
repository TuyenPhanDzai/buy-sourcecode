package org.example.buysourcecode.service;

import org.example.buysourcecode.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User findUserByUsername(String username);
    public User createUser(User user);

}
