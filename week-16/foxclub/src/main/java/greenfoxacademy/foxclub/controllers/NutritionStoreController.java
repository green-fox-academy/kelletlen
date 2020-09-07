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
public class NutritionStoreController {

  final
  FoxService foxService;

  public NutritionStoreController(FoxService foxService) {
    this.foxService = foxService;
  }
  @GetMapping(path="/nutritionStore")
  public String getNutritionStore (Model model, @RequestParam(name="name", required = false) String name) {
    Fox fox = foxService.getFox(name);
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
//whitelabel error

