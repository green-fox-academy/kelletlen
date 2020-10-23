package greenfoxacademy.foxclub.controllers;


import greenfoxacademy.foxclub.models.Fox;
import greenfoxacademy.foxclub.services.ActionService;
import greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActionHistory {

  final
  FoxService foxService;

  public ActionHistory(FoxService foxService, ActionService actionService) {
    this.foxService = foxService;
    this.actionService = actionService;
  }

  final
  ActionService actionService;

  @GetMapping(path="/actionHistory")
  public String getActionHistory(Model model, @RequestParam(name="name", required = false) String name) {
    Fox fox = foxService.findByName(name);
    model.addAttribute("fox", fox);
    model.addAttribute("name", name);
    model.addAttribute("actions", actionService.getActionList());
    model.addAttribute("listSize", actionService.getActionList().size());
    return"actionHistory";
  }
}
