package com.book.book.shared.exception.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequestMapping(MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class RestResponseStatusExceptionResolver {

  @ExceptionHandler(BaseException.class)
  public ResponseEntity<ErroesResponse> errorHadler(BaseException ex) {
    log.error("[BaseException::errorHadler] --> {}::{}",ex.getClass(), ex.getLocalizedMessage());
    return new ResponseEntity<>(ErroesResponse.builder()
        .status(ex.getStatus().value())
        .code(ex.getCode())
        .date(ex.getDate())
        .message(ex.getMessage())
        .build(), HttpStatus.valueOf(ex.getStatus().value()));
  }

}
