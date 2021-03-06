package com.greenfoxacademy.mybookshelf.services;

import com.greenfoxacademy.mybookshelf.models.Copy;
import com.greenfoxacademy.mybookshelf.repositories.CopyRepository;
import org.springframework.stereotype.Service;

@Service
public class CopyServiceImpl implements CopyService {

  final CopyRepository copyRepository;

  public CopyServiceImpl(CopyRepository copyRepository) {
    this.copyRepository = copyRepository;
  }

  @Override
  public Copy addCopy(Copy copy) {
    return copyRepository.save(copy);
  }
}
