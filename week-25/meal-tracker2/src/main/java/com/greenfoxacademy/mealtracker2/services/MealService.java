package com.greenfoxacademy.mealtracker2.services;

import com.greenfoxacademy.mealtracker2.models.Meal;
import com.greenfoxacademy.mealtracker2.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MealService {
  final
  MealRepository mealRepository;

  public MealService(MealRepository mealRepository) {
    this.mealRepository = mealRepository;
  }

  public Meal save(Meal entity) {
     return mealRepository.save(entity);
  }
  public List<Meal> listMeals () {
    return mealRepository.findAll();
  }
  public Meal findById(long id) {
    return mealRepository.findById(id);
  }
  public void deleteById(long id) {
    mealRepository.deleteById(id);
  }
  public List<Meal> findAllByDate(Date date) {
    return mealRepository.findAllByDate(date);
  }
  public int getCaloriesForADay (Date date) {
    List<Meal> meals = mealRepository.findAllByDate(date);
    int sum = 0;
    for(Meal m : meals) {
      sum +=m.getCalories();
    }
    return sum;
  }
}
