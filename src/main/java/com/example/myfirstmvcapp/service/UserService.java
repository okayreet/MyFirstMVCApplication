package com.example.myfirstmvcapp.service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Service;
//
//import java.util.List;

import com.example.myfirstmvcapp.repository.UserRepository;
import com.example.myfirstmvcapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public List<User> getUserByName(String user_name) {
        return userRepository.findByFirstNameContainingOrLastNameContaining(user_name, user_name);
    }
}
