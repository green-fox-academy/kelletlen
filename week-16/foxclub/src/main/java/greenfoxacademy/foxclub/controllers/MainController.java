package greenfoxacademy.foxclub.controllers;

import greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MainController {
  ArrayList<Fox> foxes = new ArrayList<>();

  private Fox getFox(String name) {
    return foxes.stream()
        .filter(fox -> fox.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }

  @GetMapping(path="/")
  public String root (Model model, @RequestParam(name="name", required = false) String name) {
    if (name == null || name.isEmpty()) {
      return "redirect:/login";
    } else {
      Fox fox = getFox(name);
      if(fox == null) {
        return "redirect:/login?warn=true";
      }
      model.addAttribute("fox", fox);
      return "index";
    }
  }

  @GetMapping(path="/login")
  public String getLogin (@RequestParam(name = "warn", required = false, defaultValue = "false") boolean warn, Model model) {
    model.addAttribute("warn", warn);
    return "login";
  }

  @PostMapping(path="/login")
  public String postLogin (@RequestParam(name="name") String name) {
    if (getFox(name) == null) {
      foxes.add(new Fox(name, "pizza", "lemonade"));
    }
    return "redirect:/?name=" + name;
  }
  @GetMapping(path="/nutritionStore")
  public String getNutritionStore (Model model, @RequestParam(name="name", required = false) String name) {
    Fox fox = getFox(name);
    model.addAttribute("fox", fox);
    model.addAttribute("name", name);
    return "nutritionStore";
  }
  @PostMapping(path="/nutritionStore")
  public String postNutritionStore (Model model, @RequestParam(name="name", required = false) String name, @ModelAttribute("fox") Fox fox) {
    model.addAttribute("fox", fox);
    model.addAttribute("name", name);
    return "redirect:/?name=" + name;
  }
}
//whitelabel error a nutritionStorenál
