package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  final
  PostRepository postRepository;

  final
  UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository, PostRepository postRepository) {
    this.userRepository = userRepository;
    this.postRepository = postRepository;
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

  @Override
  public List<Post> getUpVoted(long id) {

    return userRepository.findById(id).getUpVoted();
  }

  @Override
  public boolean isInUpVoted(long userId, long postId) {
    if (getUpVoted(userId).contains(postRepository.findAllById(postId))) return true;
    else return false;
  }

  @Override
  public void addToUpVoted(Post post, long userId) {
    userRepository.findById(userId).addToUpVoted(post);
  }

  @Override
  public List<Post> getDownVoted(long id) {
    return userRepository.findById(id).getDownVoted();
  }

  @Override
  public boolean isInDownVoted(long userId, long postId) {
    if (getDownVoted(userId).contains(postRepository.findAllById(postId))) return true;
    else return false;
  }

  @Override
  public void addToDownVoted(Post post, long userId) {
    userRepository.findById(userId).addToDownVoted(post);
  }
}
