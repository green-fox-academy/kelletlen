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
public class NutritionStoreController {

  final
  FoxService foxService;

  public NutritionStoreController(FoxService foxService, ActionService actionService) {

    this.foxService = foxService;
    this.actionService = actionService;
  }

  final
  ActionService actionService;

  @GetMapping(path="/nutritionStore")
  public String getNutritionStore (Model model, @RequestParam(name="name", required = false) String name) {
    Fox fox = foxService.getFox(name);
    if (fox!= null) {
      model.addAttribute("fox", fox);
      model.addAttribute("name", name);
      return "nutritionStore";
    } else {
      return "redirect:/login";
    }
  }
  @PostMapping(path="/nutritionStore")
  public String postNutritionStore (Model model, @RequestParam(name="name", required = false) String name, @ModelAttribute("fox") Fox fox) {
    Fox fox1 = foxService.getFox(name);
    String previousFood = fox1.getFood();
    String previousDrink = fox1.getDrink();
    fox1.setDrink(fox.getDrink());
    fox1.setFood(fox.getFood());
    model.addAttribute("fox", fox);
    model.addAttribute("name", name);
    actionService.addToList("Food has been changed from: " + previousFood + " to: " + fox.getFood());
    actionService.addToList("Drink has been changed from: " + previousDrink + "to: " + fox.getDrink());
    return "redirect:/?name=" + name;
  }
}

