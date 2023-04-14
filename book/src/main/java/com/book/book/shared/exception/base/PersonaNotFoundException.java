package com.book.book.shared.exception.base;

import org.springframework.http.HttpStatus;

public class PersonaNotFoundException extends BaseException {

  public PersonaNotFoundException(String message){
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.LIBRO_ID_NOT_FOUND);
  }

}
