package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.dtos.LoggedInUserDTO;
import com.greenfoxacademy.mybookshelf.dtos.UserRegistrationDTO;
import com.greenfoxacademy.mybookshelf.models.Role;
import com.greenfoxacademy.mybookshelf.models.User;

public interface UserService {
  User saveUser(User user);
  boolean existsByUsername (String username);
  LoggedInUserDTO validateUser(UserRegistrationDTO login);
  User findByUsername(String username);
  boolean doesUserOwnCopy (long userId, long copyId);
  User findById(long id);
  boolean existsById (long id);
  User updateUserRole(Role role, long id);
}
