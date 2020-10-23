package com.greenfoxacademy.backendapi.services;

import com.greenfoxacademy.backendapi.models.Text;
import org.springframework.stereotype.Service;

@Service
public class SithTextService {

  public String sithTextReverser (Text text) {
    String [] arr={"Arrgh. ", "Uhmm. ", "Err... ", "Hmmm "};
    String string = text.getText().toLowerCase();
    String [] splited1 = string.split("\\.");
    StringBuilder sb = new StringBuilder();
    for (String s:splited1) {
      if (s.startsWith(" ")){
        s = s.substring(1);
      }
      String [] splited = s.split("\\s+");
      if (splited.length%2 == 0) {
        for (int i = 0; i < splited.length ; i++) {
            if (i%2==0) {
              String temp = splited[i];
              splited[i] = splited[i +1];
              splited[i+1] = temp;
            }
        }
      } else {
        for (int i = 0; i < splited.length-1; i++) {
          if (i%2==0) {
            String temp = splited[i];
            splited[i] = splited[i +1];
            splited[i+1] = temp;
          }
        }
      }
      for (int i = 0; i < splited.length; i++) {
        sb.append(splited[i]);
        sb.append(" ");
      }
      sb.deleteCharAt(sb.length()-1);
      sb.append(".");
      sb.append(" ");
      int randomIndex = (int) (Math.random() * arr.length - 1);
      sb.append(arr[randomIndex]);
    }
    return sb.toString();
  }
}
