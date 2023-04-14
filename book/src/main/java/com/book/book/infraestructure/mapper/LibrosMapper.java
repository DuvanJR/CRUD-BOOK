package com.book.book.infraestructure.mapper;

import com.book.book.domain.entities.Libros;
import com.book.book.infraestructure.dto.LibrosDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LibrosMapper {

  @Mapping(target = "id", source = "id")
  @Mapping(target = "nomLibro", source = "nomLibro")
  @Mapping(target = "autor", source = "autor")
  @Mapping(target = "año", source = "año")
  @Mapping(target = "paginas", source = "paginas")
  LibrosDto toDto(Libros libros);

  Libros toEntity(LibrosDto librosDto);

}
