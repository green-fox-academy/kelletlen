package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.models.Book;
import com.greenfoxacademy.mybookshelf.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public Book addBook(Book book) {
    return bookRepository.save(book);
  }

  @Override
  public boolean existsByTitleAndAuthor(String title, String author) {
    return bookRepository.existsByTitleAndAuthor(title, author);
  }
}
