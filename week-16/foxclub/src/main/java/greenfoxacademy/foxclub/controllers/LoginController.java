package greenfoxacademy.foxclub.controllers;

import greenfoxacademy.foxclub.models.Fox;
import greenfoxacademy.foxclub.models.User;
import greenfoxacademy.foxclub.services.FoxService;
import greenfoxacademy.foxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  final
  UserService userService;

  final
  FoxService foxService;

  public LoginController(FoxService foxService, UserService userService) {
    this.foxService = foxService;
    this.userService = userService;
  }

  @GetMapping(path = "/")
  public String getLogin(@RequestParam(name = "warn", required = false, defaultValue = "false") boolean warn, Model model) {
    model.addAttribute("warn", warn);
    return "login";
  }

  @PostMapping(path = "/")
  public String postLogin(@RequestParam(name = "username") String username,
                          @RequestParam(name = "password") String password) {
    User user = userService.findByUsernameAndPassword(username, password);
    if (user == null) {
      return "redirect:/?warn=true";
    }
    return "redirect:/main?name=" + user.getFox().getName() + "&username=" + username;
  }
}

