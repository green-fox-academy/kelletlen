package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.models.Book;

public interface BookService {
  Book addBook (Book book);
  boolean existsByTitleAndAuthor(String title, String author);
}
