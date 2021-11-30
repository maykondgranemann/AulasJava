package com.zuplae.filmes.repository;

import java.util.List;

import com.zuplae.filmes.model.Filme;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmeRepository extends PagingAndSortingRepository<Filme,Integer> {
    @Override
    default Iterable<Filme> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    List<Filme> findByNome(String nome);
}
