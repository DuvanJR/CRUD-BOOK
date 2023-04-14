package com.book.book.domain.service;

import com.book.book.domain.entities.Libros;
import java.util.List;

public interface LibrosGetService {

  Libros getLibros(String id);
  List<Libros> getListLibros();

}
