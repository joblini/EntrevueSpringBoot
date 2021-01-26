package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Filme;

public interface FilmeService {

	public Filme save(Filme filme);

	public Filme findById(Long id); 

}
