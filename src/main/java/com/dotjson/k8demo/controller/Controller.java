package com.dotjson.k8demo.controller;

import com.dotjson.k8demo.entity.User;
import com.dotjson.k8demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class Controller {
    
    @Autowired
    Service service;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(service.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        return ResponseEntity.ok(service.getUser(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User input, @PathVariable int id) {
        return ResponseEntity.ok(service.updateUser(input, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        service.deleteUser(id);
        return ResponseEntity.ok().body(null);
    }

}
