package com.greenfoxacademy.mybookshelf.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Loan {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private long loanerId;

  @Column
  private long borrowerId;

  @Column
  private long copyId;
}
