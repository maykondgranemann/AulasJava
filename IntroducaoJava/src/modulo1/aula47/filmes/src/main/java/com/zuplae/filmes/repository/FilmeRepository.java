package com.zuplae.filmes.repository;

import com.zuplae.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer> {
}
