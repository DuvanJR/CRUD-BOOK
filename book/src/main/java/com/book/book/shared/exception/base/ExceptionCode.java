package com.book.book.shared.exception.base;

public enum ExceptionCode {
  LIBRO_ID_NOT_FOUND("COR-013", "RESOURCE_FILE_NOT_FOUND");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }

  public String getCode(){return code;}
  public String getType(){ return type;}
}
