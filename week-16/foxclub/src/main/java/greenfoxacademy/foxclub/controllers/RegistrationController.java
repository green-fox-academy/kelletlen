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
public class RegistrationController {

  final
  FoxService foxService;

  final
  UserService userService;

  public RegistrationController(UserService userService, FoxService foxService) {
    this.userService = userService;
    this.foxService = foxService;
  }

  @GetMapping(path="/register")
  public String getRegistration () {
    return "registration";
  }

  @PostMapping(path="/register")
  public String postRegistration (@RequestParam(name="username") String username,
                                 @RequestParam(name="password") String password,
                                 @RequestParam(name="password2") String password2,
                                  Model model) {
    if (password.equals(password2)) {
      User user = userService.save(new User(username, password));
      Fox fox = foxService.save(new Fox(username +"'s fox", "pizza", "lemonade"));
      user.setFox(fox);
      userService.save(user);
      foxService.save(fox);
    } else {
      model.addAttribute("fail", "Password does not match.");
    }
      return "redirect:/";
  }

}
