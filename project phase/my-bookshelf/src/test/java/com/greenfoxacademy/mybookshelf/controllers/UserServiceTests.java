package com.greenfoxacademy.mybookshelf.controllers;

import com.greenfoxacademy.mybookshelf.dtos.LoggedInUserDTO;
import com.greenfoxacademy.mybookshelf.dtos.UserRegistrationDTO;
import com.greenfoxacademy.mybookshelf.models.User;
import com.greenfoxacademy.mybookshelf.repositories.UserRepository;
import com.greenfoxacademy.mybookshelf.services.JwtServiceImpl;
import com.greenfoxacademy.mybookshelf.services.UserService;
import com.greenfoxacademy.mybookshelf.services.UserServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class UserServiceTests {
  private final UserRepository userRepository = Mockito.mock(UserRepository.class);

  private final JwtServiceImpl jwtService = Mockito.mock(JwtServiceImpl.class);

  private final BCryptPasswordEncoder bCryptPasswordEncoder = Mockito.mock(BCryptPasswordEncoder.class);

  @Test
  public void saveUser() {
    UserServiceImpl userService = new UserServiceImpl(userRepository, jwtService, bCryptPasswordEncoder);
    User newUser = new User();
    Mockito.when(userRepository.save(newUser)).thenReturn(newUser);
    User user = userService.saveUser(newUser);
    Assert.assertEquals(user, newUser);

  }

  @Test
  public void existsByUsername() {
    UserServiceImpl userService = new UserServiceImpl(userRepository, jwtService, bCryptPasswordEncoder);
    User user = User.builder()
        .username("username")
        .build();
    Mockito.when(userRepository.existsByUsername(user.getUsername())).thenReturn(true);
    Mockito.when(userRepository.existsByUsername("asd")).thenReturn(false);
    Assert.assertTrue(userService.existsByUsername(user.getUsername()));
    Assert.assertFalse(userService.existsByUsername("asd"));
  }

  @Test
  public void validateUserShouldValidateCorrectPassword() {
    UserServiceImpl userService = new UserServiceImpl(userRepository, jwtService, bCryptPasswordEncoder);
    UserRegistrationDTO userRegDTO = new UserRegistrationDTO();
    User storedUser = User.builder().build();
    String token = "asd";
    Mockito.when(userRepository.findByUsername(userRegDTO.getUsername())).thenReturn(storedUser);
    Mockito.when(jwtService.createToken(storedUser.getUsername())).thenReturn(token);
    Mockito.when(bCryptPasswordEncoder.matches(userRegDTO.getPassword(), storedUser.getPassword())).thenReturn(true);
    LoggedInUserDTO loggedInUserDTO = userService.validateUser(userRegDTO);
    Assert.assertEquals(userRegDTO.getUsername(), loggedInUserDTO.getUsername());
  }
}
