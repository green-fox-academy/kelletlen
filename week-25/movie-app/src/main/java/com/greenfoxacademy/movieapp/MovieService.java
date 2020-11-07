package com.greenfoxacademy.movieapp;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class MovieService implements ApiClient{

  MovieInterface service;

  public MovieService() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    service = retrofit.create(MovieInterface.class);
  }

  public List<Movie> getMovies() throws IOException {
    Call<List<Movie>> retrofitCall = service.getMovies();

    Response<List<Movie>> response = retrofitCall.execute();

    if (!response.isSuccessful()) {
      throw new IOException(response.errorBody() != null
          ? response.errorBody().string() : "Unknown error");
    }

    return response.body();
  }
}

