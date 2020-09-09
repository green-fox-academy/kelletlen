package greenfoxacademy.foxclub.controllers;

import greenfoxacademy.foxclub.models.Fox;
import greenfoxacademy.foxclub.services.ActionService;
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

  public TrickController(FoxService foxService, ActionService actionService) {
    this.foxService = foxService;
    this.actionService = actionService;
  }
  final
  ActionService actionService;

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
    for(String item: fox1.getTricks()) {
      if (item.equals(trick)) {
        return "redirect:/?name=" + name;
      } else continue;
    }
    fox1.addTrick(trick);
    actionService.addToList("Learned to: " + trick);
    return "redirect:/?name=" + name;
  }
}
