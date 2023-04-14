package com.book.book.infraestructure.api.controller;

import com.book.book.aplication.LibrosDelete;
import com.book.book.aplication.LibrosGet;
import com.book.book.aplication.LibrosSave;
import com.book.book.aplication.LibrosUpdate;
import com.book.book.domain.entities.Libros;
import jakarta.websocket.server.PathParam;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/libros")
@CrossOrigin(origins = "http://localhost:4200/")
public class LibrosController {


  private final LibrosSave librosSave;

  private final LibrosGet librosGet;

  private final LibrosUpdate librosUpdate;

  private final LibrosDelete librosDelete;


  /*
  @GetMapping
  public ResponseEntity<Libros> getLibros(@PathParam("id") String id){

    return ResponseEntity.ok(librosGet.getLibros(id));
  }
  */

  @GetMapping("/{id}")
  public ResponseEntity<Libros> getLibros(@PathVariable("id") String id){
    return ResponseEntity.ok(librosGet.getLibros(id));
  }

  @GetMapping(value = "/todos")
  public ResponseEntity<List<Libros>> getAllLibros(){
    return ResponseEntity.ok(librosGet.getListLibros());
  }


  @PostMapping
  public ResponseEntity<Libros> addLib(@RequestBody Libros libros){
    return new ResponseEntity<>(librosSave.saveLib(libros), HttpStatus.CREATED);
  }


  @PutMapping
  public void updateLibros(@RequestBody Libros libros){
    librosUpdate.updateLibros(libros);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteLibros(@PathVariable("id") String id){
    librosDelete.deleteLibros(id);
  }

}
