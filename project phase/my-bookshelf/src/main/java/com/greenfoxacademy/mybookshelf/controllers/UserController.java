package com.greenfoxacademy.mybookshelf.controllers;

import com.greenfoxacademy.mybookshelf.models.ResponseError;
import com.greenfoxacademy.mybookshelf.models.Role;
import com.greenfoxacademy.mybookshelf.models.User;
import com.greenfoxacademy.mybookshelf.services.RoleService;
import com.greenfoxacademy.mybookshelf.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  final RoleService roleService;
  final UserService userService;

  public UserController(RoleService roleService, UserService userService) {
    this.roleService = roleService;
    this.userService = userService;
  }

  @PatchMapping(path="/users/updateRole/{id}")
  public ResponseEntity<?> updateUserRole(@PathVariable long id, @RequestBody Role role) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    User authenticatedUser = (User) auth.getPrincipal();
    if (authenticatedUser == null) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    } else if (!userService.existsById(id)) {
      return ResponseEntity.badRequest().body(new ResponseError("There is no user in the database with this id."));
    } else {
      Role roleOfUser = roleService.findByName(role.getName());
      if (roleOfUser == null) {
        roleOfUser = roleService.save(role);
      }
      User user = userService.updateUserRole(roleOfUser, id);
      return ResponseEntity.ok(user);
    }
}
