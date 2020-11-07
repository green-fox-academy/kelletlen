package com.greenfoxacademy.movieapp;

import org.springframework.web.bind.annotation.PostMapping;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface MovieInterface {
  @GET("/movies")
  Call<List<Movie>> getMovies();

}
