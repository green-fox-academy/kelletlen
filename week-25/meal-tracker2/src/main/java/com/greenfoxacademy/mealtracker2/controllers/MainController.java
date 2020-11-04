package com.greenfoxacademy.mealtracker2.controllers;

import com.greenfoxacademy.mealtracker2.models.Meal;
import com.greenfoxacademy.mealtracker2.services.MealService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;

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
    mealService.save(meal);
    return ResponseEntity.ok().body("Meal added");
  }

  @GetMapping(value = "/list")
  public ResponseEntity<Object> listMeals() {
    return ResponseEntity.ok().body(mealService.listMeals());
  }

  @PutMapping(value = "/update/{id}")
  public ResponseEntity<Object> updateMeals(@PathVariable long id, @RequestBody Meal meal) {
    if (meal == null) {
      return ResponseEntity.badRequest().body("No meal provided");
    }
    Meal meal1 = mealService.findById(id);
    meal1.setName(meal.getName());
    meal1.setCalories(meal.getCalories());
    meal1.setDate(meal.getDate());
    mealService.save(meal1);
    return ResponseEntity.ok().body("Meal updated.");
  }

  @DeleteMapping(value = "/delete/{id}")
  public ResponseEntity<Object> deleteMeal(@PathVariable long id) {
    mealService.deleteById(id);
    return ResponseEntity.ok().body("Meal deleted");
  }

  @GetMapping(value = "/get/{id}")
  public ResponseEntity<Object> getMeal(@PathVariable long id) {
    return ResponseEntity.ok().body(mealService.findById(id));
  }

  @GetMapping(value = "/sum/{date}")
  public ResponseEntity<Object> getSum(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) throws ParseException {
    return ResponseEntity.ok().body(mealService.getCaloriesForADay(date));
  }
}
