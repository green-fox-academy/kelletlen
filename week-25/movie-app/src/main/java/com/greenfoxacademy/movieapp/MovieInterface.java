package com.greenfoxacademy.movieapp;

import org.springframework.web.bind.annotation.PostMapping;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface MovieInterface {

  @GET("list/{id}")
  @Headers("Content-Type: application/json;charset=utf-8")
  Call<Result> listMovies(@Header("Authorization") String token, @Path(value = "id") Integer path);

  @POST("/valahova")
  Call<Result> addMovie(@Header("Authorization") String token, @Body Movie movie);

}
