package greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping(path="/")
  public String show () {
    return "index";
  }
  @GetMapping(path="/login")
  public String getLogin () {
    return "login";
  }
  @PostMapping(path="/login")
  public String postLogin (Model model, @RequestParam(name="name") String name) {
    model.addAttribute("name", name);
    return "login";
  }
}
