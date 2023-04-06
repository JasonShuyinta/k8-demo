package com.dotjson.k8demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dotjson.k8demo.entity.User;
import com.dotjson.k8demo.repository.UserRepository;

@RequestMapping("/k8")
@RestController
public class Controller {
    
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> hello() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

}
