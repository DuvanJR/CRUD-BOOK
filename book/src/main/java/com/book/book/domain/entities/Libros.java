package com.book.book.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Libros {

  private String id;
  private String nomLibro;
  private String autor;
  private String año;
  private String paginas;



}
