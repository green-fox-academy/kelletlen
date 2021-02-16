package com.greenfoxacademy.dependencies.greenfoxclassapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private StudentService studentService;

  @Autowired
  MainController(StudentService studentService) {

    this.studentService = studentService;
  }

  @GetMapping(path = "/gfa")
  public String main(Model model) {
    model.addAttribute("number", studentService.count());
    return "gfa";
  }

  @GetMapping(path = "/gfa/list")
  public String listStudents(Model model) {
    model.addAttribute("names", studentService.findAll());
    return "list";
  }

  @GetMapping(path = "/gfa/add")
  public String addStudent() {
    return "add";
  }

  @PostMapping(path = "/gfa/save")
  public String saveStudent(@RequestParam(name = "name") String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping(path = "/gfa/check")
  public String studentChecker() {
    return "checker";
  }

  @PostMapping(path = "/gfa/check")
  public String checkStudent(@RequestParam(name = "name") String name, Model model) {
    if (studentService.checkIfInList(name)) {
      model.addAttribute("result", "The student is on the list.");
    } else {
      model.addAttribute("result", "The student is not on the list.");
    }
    return "checker";
  }
}
