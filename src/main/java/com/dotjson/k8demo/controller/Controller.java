package com.dotjson.k8demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dotjson.k8demo.entity.User;
import com.dotjson.k8demo.repository.UserRepository;

@RequestMapping("/users")
@RestController
public class Controller {
    
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> hello() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        return ResponseEntity.ok(userRepository.findById(id).get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User input, @PathVariable int id) {
        User user = userRepository.findById(id).get();
        user.setAge(input.getAge());
        user.setName(input.getName());
        return ResponseEntity.ok(userRepository.save(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }

}
