package com.greenfoxacademy.mealtracker2.services;

import com.greenfoxacademy.mealtracker2.models.Meal;
import com.greenfoxacademy.mealtracker2.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
  final
  MealRepository mealRepository;

  public MealService(MealRepository mealRepository) {
    this.mealRepository = mealRepository;
  }

  public Meal add(Meal entity) {
     return mealRepository.save(entity);
  }
  public List<Meal> listMeals () {
    return mealRepository.findAll();
  }
  public Meal findById(long id) {
    return mealRepository.findById(id);
  }
}
