package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.models.Loan;
import com.greenfoxacademy.mybookshelf.repositories.LoanRepository;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl implements LoanService {

  private final LoanRepository loanRepository;

  public LoanServiceImpl(LoanRepository loanRepository) {
    this.loanRepository = loanRepository;
  }

  @Override
  public Loan saveLoan(Loan loan) {
    return loanRepository.save(loan);
  }

  @Override
  public Loan findByCopyId(long copyId) {
    return loanRepository.findByCopyId(copyId);
  }
}
