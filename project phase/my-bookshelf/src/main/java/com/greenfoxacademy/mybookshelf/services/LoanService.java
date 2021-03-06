package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.models.Loan;

public interface LoanService {
  Loan saveLoan (Loan loan);
  Loan findByCopyId (long copyId);
}
