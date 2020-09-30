package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

  @Override
  public long findIdByUsernameAndPassword(String username, String password) {
    User user = userRepository.findByUsernameAndPassword(username, password);
    return user.getId();
  }

  @Override
  public User findById(long id) {
    return userRepository.findById(id);
  }
}
