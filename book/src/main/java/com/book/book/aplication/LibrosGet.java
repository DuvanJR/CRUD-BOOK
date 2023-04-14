package com.book.book.aplication;

import com.book.book.domain.entities.Libros;
import com.book.book.domain.service.LibrosGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class LibrosGet {

  private final LibrosGetService librosGetService;


  public Libros getLibros(String id){

    return librosGetService.getLibros(id);
  }

  public List<Libros> getListLibros(){
    return librosGetService.getListLibros();
  }

}
