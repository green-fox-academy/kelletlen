package com.greenfoxacademy.backendapi.services;

import org.springframework.stereotype.Service;

@Service
public class DoUntilService {

public int sum(int number) {
  int sum = 0;
  for (int j = 1; j <= number; j++) {
    sum += j;
  }
  return sum;
}
public int factor (int number) {
  int fact = 1;
  for (int i = 1; i <= number; i++) {
    fact = fact*i;
  }
  return fact;

}
}
