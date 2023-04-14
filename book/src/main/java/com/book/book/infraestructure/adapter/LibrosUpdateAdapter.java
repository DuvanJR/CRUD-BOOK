package com.book.book.infraestructure.adapter;

import com.book.book.domain.entities.Libros;
import com.book.book.domain.service.LibrosUpdateService;
import com.book.book.infraestructure.repository.LibrosRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class LibrosUpdateAdapter implements LibrosUpdateService {

  private LibrosRepository librosRepository;

  @Transactional
  public void updateLibros(Libros libros){

    librosRepository.updateLibros(libros.getId(),
        libros.getNomLibro(),
        libros.getAutor(),
        libros.getAño(),
        libros.getPaginas());
  }

}
