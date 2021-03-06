package com.greenfoxacademy.mybookshelf.controllers;

import com.greenfoxacademy.mybookshelf.dtos.ReviewDTO;
import com.greenfoxacademy.mybookshelf.models.*;
import com.greenfoxacademy.mybookshelf.services.BookService;
import com.greenfoxacademy.mybookshelf.services.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

  final BookService bookService;
  final ReviewService reviewService;

  public ReviewController(BookService bookService, ReviewService reviewService) {
    this.bookService = bookService;
    this.reviewService = reviewService;
  }

  @PostMapping(path="/books/review")
  public ResponseEntity<Object> addReview (@RequestBody ReviewDTO review) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    User authenticatedUser = (User) auth.getPrincipal();
    Book book = bookService.findById(review.getBookId());
    if (authenticatedUser == null) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    } else if (book == null) {
      return ResponseEntity.badRequest().body(new ResponseError("This book is not in the database."));
    } else {
      Review newReview = Review.builder()
          .reviewer(authenticatedUser)
          .book(book)
          .review(review.getReview())
          .build();
      reviewService.save(newReview);
      return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseState("Review saved."));
    }
  }
}
