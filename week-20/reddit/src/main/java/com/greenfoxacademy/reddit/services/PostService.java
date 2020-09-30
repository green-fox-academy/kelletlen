package com.greenfoxacademy.reddit.services;
import com.greenfoxacademy.reddit.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
  Post save(Post entity);
  List<Post> findAll();
  Post findById(long id);
  void upVote(long id);
  void downVote(long id);
}
