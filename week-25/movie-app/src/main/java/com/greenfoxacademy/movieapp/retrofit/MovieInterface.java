package com.greenfoxacademy.movieapp.retrofit;

import com.greenfoxacademy.movieapp.models.Movie;
import com.greenfoxacademy.movieapp.models.Result;
import retrofit2.Call;
import retrofit2.http.*;

public interface MovieInterface {

  @GET("list/{id}")
  @Headers("Content-Type: application/json;charset=utf-8")
  Call<Result> listMovies(@Header("Authorization") String token, @Path(value = "id") Integer path);

  @POST("/valahova")
  Call<Result> addMovie(@Header("Authorization") String token, @Body Movie movie);

}
