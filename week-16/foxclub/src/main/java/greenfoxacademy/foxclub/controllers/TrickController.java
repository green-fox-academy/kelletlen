package greenfoxacademy.foxclub.controllers;

import greenfoxacademy.foxclub.models.Fox;
import greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrickController {

  final
  FoxService foxService;

  public TrickController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping(path="/trickCenter")
  public String getTrickCenter (Model model, @RequestParam(name="name", required = false) String name) {
    Fox fox = foxService.getFox(name);
    model.addAttribute("fox", fox);
    model.addAttribute("name", name);
    return "trickCenter";
  }

  @PostMapping(path="/trickCenter")
  public String postTrickCenter (Model model, @RequestParam(name="name", required = false) String name, @RequestParam(name="trick") String trick) {
    Fox fox1 = foxService.getFox(name);
    fox1.addTrick(trick);
    return "redirect:/?name=" + name;
  }
}
