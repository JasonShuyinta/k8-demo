package com.dotjson.k8demo.service;

import com.dotjson.k8demo.entity.User;
import com.dotjson.k8demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
@Slf4j
public class Service {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        log.info("Getting all users");
        return userRepository.findAll();
    }


    public User getUser(int id) {
        log.info("Getting user with id: {}", id);
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        log.info("Creating user: {}", user);
        return userRepository.save(user);
    }

    public User updateUser(User input, int id) {
        log.info("Updating user: {}", input.toString());
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setAge(input.getAge());
            user.setName(input.getName());
            return userRepository.save(user);
        } else return null;
    }


    public void deleteUser(int id) {
        log.info("Deleting user with id: {}", id);
        userRepository.deleteById(id);
    }
}
