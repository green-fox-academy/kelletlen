package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

  private final
  PostRepository postRepository;

  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public Post save(Post entity) {
    return postRepository.save(entity);
  }

  @Override
  public List<Post> findAll() {
    return (List<Post>) postRepository.findAll();
  }

  @Override
  public Post findById(long id) {
    return postRepository.findAllById(id);
  }

  @Override
  public void upVote(long id) {
  Post post = postRepository.findAllById(id);
  post.increaseScore();
  }

  @Override
  public void downVote(long id) {
    Post post = postRepository.findAllById(id);
    post.decreaseScore();
  }

  @Override
  public List<Post> findAllByScoreDesc() {
    return postRepository.findAllByOrderByScoreDesc();
  }
}
