package com.example.entrevueSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.exception.FilmeNotFoundException;
import com.example.entrevueSpringBoot.model.Filme;
import com.example.entrevueSpringBoot.repository.FilmeRepository;

@RestController
class FilmeController {

  private final FilmeRepository repository;

  // Constructeur
  FilmeController(FilmeRepository repository) {
    this.repository = repository;
  }

  @PostMapping("/api/film")
  Filme save(@RequestBody Filme filme) {
    return repository.save(filme);
  }

  @GetMapping("/api/film/{id}")
  Filme findById(@PathVariable Long id) {
    return repository.findById(id).orElseThrow(() -> new FilmeNotFoundException(id));
  }

}