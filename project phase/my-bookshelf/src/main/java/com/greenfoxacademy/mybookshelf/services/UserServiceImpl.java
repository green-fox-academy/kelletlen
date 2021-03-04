package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.dtos.LoggedInUserDTO;
import com.greenfoxacademy.mybookshelf.dtos.UserRegistrationDTO;
import com.greenfoxacademy.mybookshelf.models.User;
import com.greenfoxacademy.mybookshelf.repositories.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  private final JwtServiceImpl jwtService;

  private final BCryptPasswordEncoder bCryptPasswordEncoder;

  public UserServiceImpl(UserRepository userRepository, JwtServiceImpl jwtService, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.userRepository = userRepository;
    this.jwtService = jwtService;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @Override
  public User addUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public boolean existsByUsername(String username) {
    return userRepository.existsByUsername(username);
  }

  @Override
  public LoggedInUserDTO validateUser(UserRegistrationDTO login) {
    User storedUser = findByUsername(login.getUsername());
    if (bCryptPasswordEncoder.matches(login.getPassword(), storedUser.getPassword())) {
      return new LoggedInUserDTO(storedUser.getUsername(), jwtService.createToken(storedUser.getUsername()));
    }
    return null;
  }

  @Override
  public User findByUsername(String username) {
    return userRepository.findByUsername(username);
  }
}
