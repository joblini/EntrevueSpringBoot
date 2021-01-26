package com.example.entrevueSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.entrevueSpringBoot.exception.FilmeNotFoundException;

@ControllerAdvice
class FilmeControllerAdvice {

  @ResponseBody
  @ExceptionHandler(FilmeNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String filmeNotFoundHandler(FilmeNotFoundException ex) {
    return ex.getMessage();
  }
}