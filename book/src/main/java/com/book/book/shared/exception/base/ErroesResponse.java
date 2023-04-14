package com.book.book.shared.exception.base;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErroesResponse {
  public int status;
  private String code;
  private String message;
  private LocalDateTime date;
}
