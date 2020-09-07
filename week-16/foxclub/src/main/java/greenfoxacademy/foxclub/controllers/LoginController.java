package greenfoxacademy.foxclub.controllers;

import greenfoxacademy.foxclub.models.Fox;
import greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  final
  FoxService foxService;

  public LoginController(FoxService foxService) {
    this.foxService = foxService;
  }
  @GetMapping(path="/login")
  public String getLogin (@RequestParam(name = "warn", required = false, defaultValue = "false") boolean warn, Model model) {
    model.addAttribute("warn", warn);
    return "login";
  }

  @PostMapping(path="/login")
  public String postLogin (@RequestParam(name="name") String name) {
    if (foxService.getFox(name) == null) {
      foxService.addFox(new Fox(name, "pizza", "lemonade"));
    }
    return "redirect:/?name=" + name;
  }
}

