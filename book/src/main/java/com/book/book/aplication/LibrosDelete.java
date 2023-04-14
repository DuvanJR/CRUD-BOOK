package com.book.book.aplication;

import com.book.book.domain.service.LibrosDeleteService;
import com.book.book.infraestructure.repository.LibrosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LibrosDelete {

  private final LibrosDeleteService librosDeleteService;

  public void deleteLibros(String id){
    librosDeleteService.deleteLibros(id);
  }

}
