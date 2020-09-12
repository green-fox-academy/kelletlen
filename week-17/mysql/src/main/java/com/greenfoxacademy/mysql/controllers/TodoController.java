package com.greenfoxacademy.mysql.controllers;


import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping(value="add")
  public String addTask () {
    return "add";
  }
  @PostMapping(value="add")
  public String postAddTask (@RequestParam(name="task") String task, @RequestParam(name="urgency") boolean urgency) {
    Todo newTodo = new Todo(task, urgency);
    todoRepository.save(newTodo);
    return "redirect:/todo/list?isActive=false";
  }

}
