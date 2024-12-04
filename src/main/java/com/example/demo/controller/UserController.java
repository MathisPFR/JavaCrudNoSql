package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userservice;

    @GetMapping(value = "", produces= "application/json")
    public List<User> getAll() {
        return userservice.getUsers();
    }

    @PostMapping(path = "")
    public User insertUser(User user) {
        return userservice.insertUser(user);
    }

    @PutMapping(path = "")
    public void updateUser(User user) {
        userservice.updateUser(user);
    }

    public Optional<User> findById(String s) {
        return userservice.findById(s);
    }

    public User save(User existingUser) {
        return userservice.save(existingUser);
    }

    public void deleteUser(String s) {
        userservice.deleteById(s);
    }
}
