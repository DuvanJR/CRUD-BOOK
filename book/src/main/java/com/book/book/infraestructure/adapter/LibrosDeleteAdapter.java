package com.book.book.infraestructure.adapter;

import com.book.book.domain.service.LibrosDeleteService;
import com.book.book.infraestructure.repository.LibrosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LibrosDeleteAdapter implements LibrosDeleteService {

  private final LibrosRepository librosRepository;

  public void deleteLibros(String id){
    librosRepository.deleteById(id);
  }

}
