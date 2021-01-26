package com.example.entrevueSpringBoot.service;

import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.exception.FilmeNotFoundException;
import com.example.entrevueSpringBoot.model.Filme;
import com.example.entrevueSpringBoot.repository.FilmeRepository;

@Service
public class FilmeServiceImpl implements FilmeService {

	private final FilmeRepository repository;

	// Constructeur
	public FilmeServiceImpl(FilmeRepository repository) {
		this.repository = repository;
	}

	public Filme save(Filme filme) {
		return repository.save(filme);
	}

	public Filme findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new FilmeNotFoundException(id));
	}

}
