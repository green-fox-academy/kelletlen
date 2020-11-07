package com.greenfoxacademy.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class MainRestController {
  final
  MovieService movieService;

  public MainRestController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping(path = "/movie")
  public List<Movie> listMovies() throws IOException {
    return movieService.getMovies();
  }
}

