package com.greenfoxacademy.movieapp.controllers;

import com.greenfoxacademy.movieapp.services.MovieService;
import com.greenfoxacademy.movieapp.models.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MainRestController {
  final
  MovieService movieService;

  public MainRestController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping(path = "/all")
  public Result listMovies() throws IOException {
    return this.movieService.getResponse();
  }
}

