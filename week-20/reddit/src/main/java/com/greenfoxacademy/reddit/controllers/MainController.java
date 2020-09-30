package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

 final
 PostServiceImpl postService;

  public MainController(PostServiceImpl postService) {
    this.postService = postService;
  }


  @GetMapping(value="/")
  public String getPosts (Model model) {
    model.addAttribute("posts", postService.findAllByScoreDesc());
    return "index";
  }

  @GetMapping(value="/submit")
  public String getSubmit () {
    return "submit";
  }

  @PostMapping(value="/submit")
  public String postSubmit (@RequestParam(name="title") String title,
                            @RequestParam(name="url") String url) {
    Post post = new Post(title, url);
    postService.save(post);
    return "redirect:/";
  }
  @GetMapping(value="/upVote/{id}")
  public String upVote (@PathVariable long id) {
    postService.upVote(id);
    postService.save(postService.findById(id));
    return "redirect:/";
  }
  @GetMapping(value="/downVote/{id}")
  public String downVote (@PathVariable long id) {
    postService.downVote(id);
    postService.save(postService.findById(id));
    return "redirect:/";
  }
  @GetMapping (value="/register")
  public String getRegister () {
    return "";
  }
  @PostMapping (value="/register")
  public String postRegister (@RequestParam(name="username") String name,
                              @RequestParam(name="password") String password) {

    return "";
  }
}
