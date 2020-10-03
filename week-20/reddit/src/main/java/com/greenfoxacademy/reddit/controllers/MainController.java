package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import com.greenfoxacademy.reddit.services.UserServiceImpl;
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
  UserServiceImpl userService;

 final
 PostServiceImpl postService;

  public MainController(PostServiceImpl postService, UserServiceImpl userService) {
    this.postService = postService;
    this.userService = userService;
  }


  @GetMapping(value="/")
  public String getPosts (Model model, @RequestParam(name="id" , required= false) Long id) {
    if(id==null) {
      return "redirect:/login";
    }
    model.addAttribute("posts", postService.findAllByScoreDesc());
    model.addAttribute("name", userService.findById(id).getUsername());
    model.addAttribute("id", id);
    return "index";
  }

  @GetMapping(value="/submit")
  public String getSubmit (@RequestParam(name="id") long id, Model model) {
    model.addAttribute("id", id);
    return "submit";
  }

  @PostMapping(value="/submit")
  public String postSubmit (@RequestParam(name="title") String title,
                            @RequestParam(name="url") String url,
                            @RequestParam(name="id") long id) {
    Post post = new Post(title, url);
    post.setUser(userService.findById(id));
    postService.save(post);
    return "redirect:/?id=" + id;
  }
  
  @GetMapping(value="/upVote/{postId}")
  public String upVote (@PathVariable long postId,
                        @RequestParam(name="id") long id) {
    if(userService.isInUpVoted(id, postId)) {
      return "redirect:/?id=" + id;
    } else {
      postService.upVote(postId);
      postService.save(postService.findById(postId));
      userService.addToUpVoted(postService.findById(postId), id);
    }
    return "redirect:/?id=" + id;
  }

  @GetMapping(value="/downVote/{postId}")
  public String downVote (@PathVariable long postId,
                          @RequestParam(name="id") long id) {
    if (userService.isInDownVoted(id, postId)) {
      return "redirect:/?id=" + id;
    } else {
      postService.downVote(postId);
      postService.save(postService.findById(postId));
      userService.addToDownVoted(postService.findById(postId), id);
    }
    return "redirect:/?id=" + id;
  }

  @GetMapping (value="/register")
  public String getRegister () {
    return "register";
  }
  @PostMapping (value="/register")
  public String postRegister (@RequestParam(name="username") String name,
                              @RequestParam(name="password") String password) {
    User user = new User(name, password);
    userService.save(user);
    long id = userService.findIdByUsernameAndPassword(name, password);
    return "redirect:/?id=" + id;
  }
  @GetMapping(value="/login")
  public String getLogin () {
    return "login";
  }
  @PostMapping(value="/login")
  public String postLogin (@RequestParam(name="username") String name,
                           @RequestParam(name="password") String password,
                           Model model) {
    if(userService.findByUsernameAndPassword(name, password) == null) {
      model.addAttribute("fail", "Wrong username or password!");
      return "login";
    } else {
      return "redirect:/?id=" + userService.findIdByUsernameAndPassword(name, password);
    }
  }
}
