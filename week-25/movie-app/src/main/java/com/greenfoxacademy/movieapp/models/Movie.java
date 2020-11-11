package com.greenfoxacademy.movieapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Movie {
  Integer id;
  String media_type;
  String original_language;
  String title;
  String backdrop_path;
  Double popularity;
  Integer vote_count;
  Boolean video;
  Double vote_average;

  public Movie(Integer id, String media_type, String original_language, String title, String backdrop_path, Double popularity, Integer vote_count, Boolean video, Double vote_average) {
    this.id = id;
    this.media_type = media_type;
    this.original_language = original_language;
    this.title = title;
    this.backdrop_path = backdrop_path;
    this.popularity = popularity;
    this.vote_count = vote_count;
    this.video = video;
    this.vote_average = vote_average;
  }

  public Movie() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMedia_type() {
    return media_type;
  }

  public void setMedia_type(String media_type) {
    this.media_type = media_type;
  }

  public String getOriginal_language() {
    return original_language;
  }

  public void setOriginal_language(String original_language) {
    this.original_language = original_language;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBackdrop_path() {
    return backdrop_path;
  }

  public void setBackdrop_path(String backdrop_path) {
    this.backdrop_path = backdrop_path;
  }

  public Double getPopularity() {
    return popularity;
  }

  public void setPopularity(Double popularity) {
    this.popularity = popularity;
  }

  public Integer getVote_count() {
    return vote_count;
  }

  public void setVote_count(Integer vote_count) {
    this.vote_count = vote_count;
  }

  public Boolean getVideo() {
    return video;
  }

  public void setVideo(Boolean video) {
    this.video = video;
  }

  public Double getVote_average() {
    return vote_average;
  }

  public void setVote_average(Double vote_average) {
    this.vote_average = vote_average;
  }
}

