package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.SithText;
import com.greenfoxacademy.backendapi.models.Text;
import com.greenfoxacademy.backendapi.services.SithTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithTextController {

  final
  SithTextService sithTextService;

  public SithTextController(SithTextService sithTextService) {
    this.sithTextService = sithTextService;
  }

  @PostMapping(value = "/sith")
  public ResponseEntity<Object> getSithText(@RequestBody Text text) {
    if (text == null) {
      return ResponseEntity.badRequest().body(new Error("Feed me some text you have to, padawan young you are. Hmmm."));
    }
    String SithText = sithTextService.sithTextReverser(text);
    SithText st = new SithText();
    st.setSith_text(SithText);
    return ResponseEntity.ok().body(st);
  }
}
