package com.example.demo.services;

import com.example.demo.entities.User;

// UserDetailsService.java
public interface UserService {
    User loadUserByUsername(String username);
}
