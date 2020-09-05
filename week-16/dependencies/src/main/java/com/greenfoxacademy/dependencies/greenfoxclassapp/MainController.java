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

  @GetMapping(path="/gfa")
  public String main () {
    return "gfa";
  }
  @GetMapping(path="/gfa/list")
  public String listStudents (Model model) {
    model.addAttribute("names", studentService.findAll());
    return "list";
  }
  @GetMapping(path="/gfa/add")
  public String addStudent () {
    return "add";
  }
  @PostMapping(path="/gfa/save")
  public String saveStudent (@ModelAttribute String name) {
    studentService.save(name);
    return "add";
  }
}
//nem listázza ki rendesen, csak a bulletpointok vannak ott név nélkül