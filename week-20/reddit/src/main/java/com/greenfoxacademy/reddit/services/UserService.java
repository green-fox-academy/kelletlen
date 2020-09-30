package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;

public interface UserService {
  User save(User entity);
  User findByUsernameAndPassword(String username, String password);
}
