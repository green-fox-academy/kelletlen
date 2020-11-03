package com.greenfoxacademy.mealtracker2.repositories;

import com.greenfoxacademy.mealtracker2.models.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {
List<Meal> findAll();
Meal findById(long id);
}
