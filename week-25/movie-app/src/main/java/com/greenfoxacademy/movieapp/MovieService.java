package com.greenfoxacademy.movieapp;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class MovieService{

  private final String token = "Bearer " + System.getenv("MOVIE_TOKEN");
  private final String baseURL = "https://api.themoviedb.org/4/";
  Retrofit retrofit = new Retrofit.Builder()
      .baseUrl(baseURL)
      .addConverterFactory(GsonConverterFactory.create())
      .build();

  MovieInterface movieService = retrofit.create(MovieInterface.class);

  public Result getResponse() throws IOException {
    Call<Result> fetch = movieService.listMovies(this.token, 1);
    Response<Result> result = fetch.execute();
    return result.body();
  }

  public Result potPerson() throws IOException {
    Call<Result> fetch = movieService.addMovie(this.token, new Movie());
    Response<Result> result = fetch.execute();
    return result.body();
  }
}

