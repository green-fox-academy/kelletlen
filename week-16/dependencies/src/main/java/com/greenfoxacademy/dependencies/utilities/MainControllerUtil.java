package com.greenfoxacademy.dependencies.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllerUtil {
  private UtilityService utilityService;

  @Autowired
  MainControllerUtil(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(path = "/useful")
  public String main() {
    return "index";
  }

  @GetMapping(path = "/useful/colored")
  public String displayBackground(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "background";
  }

  @GetMapping(path = "/useful/email")
  public String emailValidator(@RequestParam(name = "email") String email, Model model) {
    model.addAttribute("email", utilityService.validateEmail(email));
    return "email";
  }

  @GetMapping(path = "/useful/encoding")
  public String caesarEncoding(@RequestParam(name = "text") String text, @RequestParam(name = "number") int number, Model model) {
    model.addAttribute("code", utilityService.caesar(text, number));
    return "caesarEncoding";
  }

  @GetMapping(path = "/useful/decoding")
  public String caesarDecoding(@RequestParam(name = "text") String text, @RequestParam(name = "number") int number, Model model) {
    model.addAttribute("code", utilityService.caesar(text, -number));
    return "caesarEncoding";
  }

}
