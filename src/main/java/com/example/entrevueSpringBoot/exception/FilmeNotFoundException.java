package com.example.entrevueSpringBoot.exception;

public class FilmeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FilmeNotFoundException(Long id) {
    super("Filme introuvable : " + id);
  }
}