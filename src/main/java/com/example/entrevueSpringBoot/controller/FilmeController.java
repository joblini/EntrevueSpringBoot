package com.example.entrevueSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.exception.FilmeNotFoundException;
import com.example.entrevueSpringBoot.model.Filme;
import com.example.entrevueSpringBoot.repository.FilmeRepository;
import com.example.entrevueSpringBoot.service.FilmeService;

@RestController
class FilmeController {

  private final FilmeService service;

  // Constructeur
  FilmeController(FilmeService service) {
    this.service = service;
  }

  @PostMapping("/api/film")
  ResponseEntity<Filme> save(@RequestBody Filme filme) {
    return new ResponseEntity<Filme>(service.save(filme), HttpStatus.CREATED);
  }

  @GetMapping("/api/film/{id}")
  ResponseEntity<Filme>  findById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id));
  }

}