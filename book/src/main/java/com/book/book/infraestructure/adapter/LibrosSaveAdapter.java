package com.book.book.infraestructure.adapter;

import com.book.book.domain.entities.Libros;
import com.book.book.domain.service.LibrosSaveService;
import com.book.book.infraestructure.dto.LibrosDto;
import com.book.book.infraestructure.mapper.LibrosMapper;
import com.book.book.infraestructure.repository.LibrosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class LibrosSaveAdapter implements LibrosSaveService {

  private final LibrosRepository librosRepository;
  private final LibrosMapper librosMapper;

  @Override
  public Libros save(Libros libros){

    return librosMapper.toEntity(librosRepository.save(librosMapper.toDto(libros)));
  }



  private LibrosDto buildLibros(Libros libros){
    return new LibrosDto(libros.getId(), libros.getNomLibro(), libros.getAutor(),
        libros.getAño(), libros.getPaginas());
  }

  private Libros buildLibros(LibrosDto libros){
    return new Libros(libros.getId(), libros.getNomLibro(), libros.getAutor(),
        libros.getAño(), libros.getPaginas());
  }

}
