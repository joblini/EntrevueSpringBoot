package com.example.entrevueSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.entrevueSpringBoot.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

	Filme findById(@Param("id") String name);

}
