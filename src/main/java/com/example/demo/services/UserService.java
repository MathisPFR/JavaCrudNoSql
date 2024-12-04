package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    // Constructeur pour l'injection de dépendances
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Méthode pour récupérer tous les utilisateurs
    public List<User> getUsers() {
        return userRepository.findAll(); // Appel sur l'instance userRepository
    }

    public User insertUser(User user) {
        return userRepository.insert(user);
    }

    public Optional<User> updateUser(User user) {
        return Optional.of(userRepository.insert(user));
    }

    public Optional<User> findById(String s) {
        return userRepository.findById(s);
    }

    public User save(User existingUser) {
        return userRepository.save(existingUser);
    }

    public void deleteById(String s) {
        userRepository.deleteById(s);
    }
}
