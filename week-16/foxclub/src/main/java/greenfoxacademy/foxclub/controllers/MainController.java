package greenfoxacademy.foxclub.controllers;

import greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {
  ArrayList<Fox> foxes = new ArrayList<>();

  @GetMapping(path="/")
  public String show (Model model, @RequestParam(name="name", required = false) String name) {
    if (name == null || name.isEmpty()) {
      return "redirect:/login";
    } else {
      model.addAttribute("name", name);
      return "index";
    }
  }

  @GetMapping(path="/login")
  public String getLogin () {

    return "login";
  }

  @PostMapping(path="/login")
  public String postLogin (@RequestParam(name="name") String name) {
    return "redirect:/?name=" + name;
  }
}
