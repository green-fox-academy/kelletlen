package com.greenfoxacademy.mealtracker2.controllers;

import com.greenfoxacademy.mealtracker2.models.Meal;
import com.greenfoxacademy.mealtracker2.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

  final
  MealService mealService;

  public MainController(MealService mealService) {
    this.mealService = mealService;
  }

  @PostMapping(value = "/add")
  public ResponseEntity<Object> addMeal(@RequestBody Meal meal) {
    if (meal == null) {
      return ResponseEntity.badRequest().body("No meal provided");
    }
    mealService.add(meal);
    return ResponseEntity.ok().body("Meal added");
  }

  @GetMapping(value = "/list")
  public ResponseEntity<Object> listMeals() {
    return ResponseEntity.ok().body(mealService.listMeals());
  }
  @PutMapping(value="/update/{id}")
  public ResponseEntity<Object> updateMeals(@PathVariable long id, @RequestBody Meal meal) {
    if (meal == null) {
      return ResponseEntity.badRequest().body("No meal provided");
    }

  }

}
