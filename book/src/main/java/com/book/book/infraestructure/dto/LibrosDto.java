package com.book.book.infraestructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class LibrosDto {

  @Id
  private String id;
  private String nomLibro;
  private String autor;
  private String año;
  private String paginas;


}
