package greenfoxacademy.foxclub.controllers;

import greenfoxacademy.foxclub.models.Fox;
import greenfoxacademy.foxclub.services.ActionService;
import greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MainController {

  final
  FoxService foxService;

  public MainController(FoxService foxService, ActionService actionService) {

    this.foxService = foxService;
    this.actionService = actionService;
  }
  final
  ActionService actionService;

  @GetMapping(path = "/main")
  public String root(Model model, @RequestParam(name = "name", required = false) String name,
                     @RequestParam (name="username") String username) {
    if (name == null || name.isEmpty()) {
      return "redirect:/login";
    } else {
      Fox fox = foxService.findByName(name);
      if (fox == null) {
        return "redirect:/login?warn=true";
      }
      model.addAttribute("fox", fox);
      model.addAttribute("actions", actionService.getActionList());
      model.addAttribute("listSize", actionService.getActionList().size());
      return "index";
    }
  }
}


