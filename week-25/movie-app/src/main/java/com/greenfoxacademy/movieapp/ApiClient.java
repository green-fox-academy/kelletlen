package com.greenfoxacademy.movieapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface ApiClient {
  static final String API_BASE_URL = "https://developers.themoviedb.org";
  //static final String API_VERSION_SPEC = "application/vnd.github.v3+json";
  static final String JSON_CONTENT_TYPE = "application/json";
}
