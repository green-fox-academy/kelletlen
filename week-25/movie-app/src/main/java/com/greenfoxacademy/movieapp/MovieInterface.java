package com.greenfoxacademy.movieapp;

import org.springframework.web.bind.annotation.PostMapping;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

public interface MovieInterface {
  @GET("/movies")
  @Headers("Content-Type: application/json;charset=utf-8")
  Call<List<Movie>> getMovies();

}
