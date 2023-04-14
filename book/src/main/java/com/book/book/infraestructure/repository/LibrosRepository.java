package com.book.book.infraestructure.repository;

import com.book.book.infraestructure.dto.LibrosDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



public interface LibrosRepository extends JpaRepository<LibrosDto, String> {

  @Query(nativeQuery = true, value = "update libros_dto set nom_libro = :nom_libro, autor = :autor, año = :año, paginas = :paginas where id = :id")

  @Modifying
  void updateLibros(@Param("id") String id,
      @Param("nom_libro") String nomLibro,
      @Param("autor") String autor,
      @Param("año") String año,
      @Param("paginas") String paginas);

}
