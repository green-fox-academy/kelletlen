package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {
  Post save(Post entity);

  List<Post> findAll();

  Post findById(long id);

  void upVote(long id);

  void downVote(long id);

  List<Post> findAllByScoreDesc();
}
