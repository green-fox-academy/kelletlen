package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;

import java.util.List;

public interface UserService {
  User save(User entity);
  User findByUsernameAndPassword(String username, String password);
  long findIdByUsernameAndPassword(String username, String password);
  User findById (long id);
  List<Post> getUpVoted (long id);
  boolean isInUpVoted (long userId, long postId);
  void addToUpVoted (Post post, long userId);
  List<Post> getDownVoted (long id);
  boolean isInDownVoted(long userId, long postId);
  void addToDownVoted(Post post, long userId);
}
