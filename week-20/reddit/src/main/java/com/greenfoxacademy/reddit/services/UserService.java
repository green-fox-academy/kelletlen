package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;

import java.util.Optional;

public interface UserService {
  User save(User entity);
  User findByUsernameAndPassword(String username, String password);
  long findIdByUsernameAndPassword(String username, String password);
  User findById (long id);
}
