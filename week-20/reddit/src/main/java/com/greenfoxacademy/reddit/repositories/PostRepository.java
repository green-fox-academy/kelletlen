package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  Post findAllById(long id);

  List<Post> findAllByOrderByScoreDesc();

}
