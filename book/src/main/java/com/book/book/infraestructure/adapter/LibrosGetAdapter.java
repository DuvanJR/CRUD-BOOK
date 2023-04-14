package com.book.book.infraestructure.adapter;

import com.book.book.domain.entities.Libros;
import com.book.book.domain.service.LibrosGetService;
import com.book.book.infraestructure.dto.LibrosDto;
import com.book.book.infraestructure.mapper.LibrosMapper;
import com.book.book.infraestructure.repository.LibrosRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
@Slf4j
public class LibrosGetAdapter implements LibrosGetService {

  private final LibrosRepository librosRepository;
  private final LibrosMapper librosMapper;

  @Override
  public Libros getLibros(String id){

    Optional<LibrosDto> librosDto = librosRepository.findById(id);
    return  librosMapper.toEntity(librosDto.get());

  }


  public List<Libros> getListLibros(){
    List<LibrosDto> librosDtos = librosRepository.findAll();
    return librosDtos.stream().map(librosMapper::toEntity).toList();

  }



  private Libros buildLibros(LibrosDto libros){
    return new Libros(libros.getId(), libros.getNomLibro(), libros.getAutor(), libros.getAño(), libros.getPaginas());
  }



}
