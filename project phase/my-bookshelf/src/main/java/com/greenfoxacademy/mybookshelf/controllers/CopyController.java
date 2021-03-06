package com.greenfoxacademy.mybookshelf.controllers;

import com.greenfoxacademy.mybookshelf.dtos.LoanDTO;
import com.greenfoxacademy.mybookshelf.models.*;
import com.greenfoxacademy.mybookshelf.services.BookService;
import com.greenfoxacademy.mybookshelf.services.CopyService;
import com.greenfoxacademy.mybookshelf.services.LoanService;
import com.greenfoxacademy.mybookshelf.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyController {

  final BookService bookService;
  final CopyService copyService;
  final UserService userService;
  final LoanService loanService;

  public CopyController(BookService bookService, CopyService copyService, UserService userService, LoanService loanService) {
    this.bookService = bookService;
    this.copyService = copyService;
    this.userService = userService;
    this.loanService = loanService;
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
      copyService.saveCopy(copy);
      authenticatedUser.addToBookShelf(copy);
      userService.saveUser(authenticatedUser);
      return ResponseEntity.status(HttpStatus.CREATED).body(copy);
    }
  }

  @PostMapping(path = "/copy/loan")
  public ResponseEntity<Object> loanCopy(@RequestBody LoanDTO loan) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    User authenticatedUser = (User) auth.getPrincipal();
    if (authenticatedUser == null) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    } else if (!userService.doesUserOwnCopy(authenticatedUser.getId(), loan.getCopyId())) {
      return ResponseEntity.badRequest().body(new ResponseError("You don't have a copy of this book."));
    } else if (loanService.findByCopyId(loan.getCopyId()) != null) {
      return ResponseEntity.badRequest().body(new ResponseError("This copy is already loaned."));
    } else if (userService.findById(loan.getBorrowerId()) == null) {
      return ResponseEntity.badRequest().body(new ResponseError("User does not exist."));
    } else {
      Loan newLoan = Loan.builder()
          .loanerId(authenticatedUser.getId())
          .borrowerId(loan.getBorrowerId())
          .copyId(loan.getCopyId())
          .build();
      loanService.saveLoan(newLoan);
      return ResponseEntity.status(HttpStatus.CREATED).body(newLoan);
    }
  }
}
