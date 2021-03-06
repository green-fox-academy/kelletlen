package com.greenfoxacademy.mybookshelf.repositories;

import com.greenfoxacademy.mybookshelf.models.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends CrudRepository <Loan, Long> {
  Loan findByCopyId (long copyId);
  Loan findById (long id);
  Loan findByLoanerId (long loanerId);
  void deleteById (long id);
}
