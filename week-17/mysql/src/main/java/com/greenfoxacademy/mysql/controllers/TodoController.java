package com.greenfoxacademy.mysql.controllers;


import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("todo")
public class TodoController {

  final
  TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"list", "/"})
  public String list(Model model, @RequestParam(name="isActive", defaultValue = "false") boolean isActive) {
    if (isActive) {
      ArrayList<Todo> actives = new ArrayList();
      for (Todo item : todoRepository.findAll()) {
        if (!item.isDone()) {
          actives.add(item);
        }
      }
      model.addAttribute("todos", actives);
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todoList";



  }
}
