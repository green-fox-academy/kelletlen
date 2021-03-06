package com.greenfoxacademy.mybookshelf.controllers;

import com.greenfoxacademy.mybookshelf.models.Book;
import com.greenfoxacademy.mybookshelf.models.Copy;
import com.greenfoxacademy.mybookshelf.models.ResponseError;
import com.greenfoxacademy.mybookshelf.models.User;
import com.greenfoxacademy.mybookshelf.services.BookService;
import com.greenfoxacademy.mybookshelf.services.CopyService;
import com.greenfoxacademy.mybookshelf.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyController {

  final BookService bookService;
  final CopyService copyService;
  final UserService userService;

  public CopyController(BookService bookService, CopyService copyService, UserService userService) {
    this.bookService = bookService;
    this.copyService = copyService;
    this.userService = userService;
  }

  @PostMapping(path = "/copy/add/{id}")
  public ResponseEntity<Object> addCopy(@PathVariable long id) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    User authenticatedUser = (User) auth.getPrincipal();
    if (authenticatedUser == null) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    } else if (bookService.findById(id) == null) {
      return ResponseEntity.badRequest().body(new ResponseError("There is no book in the database with this id."));
    } else {
      Book book = bookService.findById(id);
      Copy copy = new Copy();
      copy.setBook(book);
      copy.setUser(authenticatedUser);
      copyService.addCopy(copy);
      authenticatedUser.addToBookShelf(copy);
      userService.addUser(authenticatedUser);
      return ResponseEntity.status(HttpStatus.CREATED).body(copy);
    }
  }
}
