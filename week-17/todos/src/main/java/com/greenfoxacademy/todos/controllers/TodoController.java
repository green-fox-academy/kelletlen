package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.models.Assignee;
import com.greenfoxacademy.todos.models.Todo;
import com.greenfoxacademy.todos.repositories.AssigneeRepository;
import com.greenfoxacademy.todos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("todo")
public class TodoController {

  final
  TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {

    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  final
  AssigneeRepository assigneeRepository;

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

  @PostMapping(value="search")
  public String searchTodo (@RequestParam(name="title") String title, Model model) {
    todoRepository.findAllByTitleContainingIgnoreCase(title);
    model.addAttribute("todos",todoRepository.findAllByTitleContainingIgnoreCase(title));
    return "searchResult";
  }

  @GetMapping(value="assignees")
  public String getAssignees (Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignees";
  }

  @PostMapping(value="addAssignee")
  public String addAssignee (@RequestParam(name="name") String name, @RequestParam(name="email") String email) {
    assigneeRepository.save(new Assignee(name, email));
    return "redirect:/todo/assignees";
  }
  @GetMapping(value="editAssignee/{id}")
  public String getEditAssignee (@PathVariable long id, Model model) {
    model.addAttribute("assignee", assigneeRepository.findAllById(id));
    return "editAssignee";
  }
  @PostMapping(value="editAssignee/{id}")
  public String postEditAssignee (@PathVariable long id, @RequestParam(name="new") String newName) {
    Assignee assignee = assigneeRepository.findAllById(id);
    assignee.setName(newName);
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignees";
  }
  @GetMapping(value="removeAssignee/{id}")
  public String removeAssignee (@PathVariable long id) {
    Assignee assignee = assigneeRepository.findAllById(id);
    assigneeRepository.delete(assignee);
    return "redirect:/todo/assignees";
  }

  @GetMapping(value="assignee/{id}")
  public String getTodosOfAssignee (@PathVariable long id, Model model) {
    model.addAttribute("assignee", assigneeRepository.findAllById(id).getName());
    model.addAttribute("todos", assigneeRepository.findAllById(id).getTodoList());
    return "assignee";
  }
}
