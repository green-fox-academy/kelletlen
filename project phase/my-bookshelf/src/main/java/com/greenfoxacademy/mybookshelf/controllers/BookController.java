package com.greenfoxacademy.mybookshelf.controllers;

import com.greenfoxacademy.mybookshelf.models.Book;
import com.greenfoxacademy.mybookshelf.models.ResponseError;
import com.greenfoxacademy.mybookshelf.models.User;
import com.greenfoxacademy.mybookshelf.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @PostMapping(path = "/books/add")
  public ResponseEntity<Object> addBook(@RequestBody Book book) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    User authenticatedUser = (User) auth.getPrincipal();
    if (authenticatedUser == null) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    } else if (bookService.existsByTitleAndAuthor(book.getTitle(), book.getAuthor())) {
      return ResponseEntity.badRequest().body(new ResponseError("This book is already in the database."));
    } else {
      bookService.addBook(book);
      return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }
  }
}

