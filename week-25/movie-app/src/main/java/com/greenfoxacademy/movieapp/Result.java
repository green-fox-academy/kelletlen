package com.greenfoxacademy.movieapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Result {

@JsonProperty("result")
  private List<Movie> results;

  public Result(List<Movie> results) {
    this.results = results;
  }

  public Result() {
  }

  public List<Movie> getResults() {
    return results;
  }

  public void setResults(List<Movie> results) {
    this.results = results;
  }
}
