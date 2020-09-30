package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsernameAndPassword(String username, String password);
}
