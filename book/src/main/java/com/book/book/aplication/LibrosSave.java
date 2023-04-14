package com.book.book.aplication;

import com.book.book.domain.entities.Libros;
import com.book.book.domain.service.LibrosSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LibrosSave {

  private final LibrosSaveService librosSaveService;

  public Libros saveLib(Libros libros){

    return librosSaveService.save(libros);
  }

}
