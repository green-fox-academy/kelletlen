package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.dtos.LoggedInUserDTO;
import com.greenfoxacademy.mybookshelf.dtos.UserRegistrationDTO;
import com.greenfoxacademy.mybookshelf.models.User;

public interface UserService {
  User addUser(User user);
  boolean existsByUsername (String username);
  LoggedInUserDTO validateUser(UserRegistrationDTO login);
  User findByUsername(String username);
}
