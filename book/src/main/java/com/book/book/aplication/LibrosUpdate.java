package com.book.book.aplication;

import com.book.book.domain.entities.Libros;
import com.book.book.domain.service.LibrosUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LibrosUpdate {

  private final LibrosUpdateService librosUpdateService;

  public void updateLibros(Libros libros){
    librosUpdateService.updateLibros(libros);
  }

}
