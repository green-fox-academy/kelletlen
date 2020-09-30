package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  final
  UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User save(User entity) {
    return userRepository.save(entity);
  }

  @Override
  public User findByUsernameAndPassword(String username, String password) {
    return userRepository.findByUsernameAndPassword(username, password);
  }
}
