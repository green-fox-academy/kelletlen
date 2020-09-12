package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todo")
public class TodoController {

  final
  TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"list", "/"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todoList";
  }
}
