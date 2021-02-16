package com.greenfoxacademy.backendapi.services;

import com.greenfoxacademy.backendapi.models.Array;
import com.greenfoxacademy.backendapi.models.ArrayResult;
import com.greenfoxacademy.backendapi.models.ArrayResult2;
import org.springframework.stereotype.Service;

@Service
public class ArrayService {

  public Object calculate(Array array) {
    if (array.getWhat().equals("sum")) {
      int sum = 0;
      for (int i = 0; i < array.getNumbers().length; i++) {
        sum = sum + array.getNumbers()[i];
      }
      return new ArrayResult(sum);
    } else if (array.getWhat().equals("multiply")) {
      int m = 1;
      for (int i = 0; i < array.getNumbers().length; i++) {
        m = m * array.getNumbers()[i];
      }
      return new ArrayResult(m);
    } else if (array.getWhat().equals("double")) {
      int[] d = new int[array.getNumbers().length];
      for (int i = 0; i < array.getNumbers().length; i++) {
        d[i] = array.getNumbers()[i] * 2;
      }
      return new ArrayResult2(d);
    } else return new Error("Please provide what to do with the numbers!");
  }
}
