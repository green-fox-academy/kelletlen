package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  final
  PostService postService;

  public MainController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping(value={"/"})
  public String getPosts (Model model) {
    model.addAttribute("posts", postService.findAll());
    return "index";
  }
}
