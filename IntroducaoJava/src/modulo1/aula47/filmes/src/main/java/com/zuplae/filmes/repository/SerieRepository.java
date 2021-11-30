package com.zuplae.filmes.repository;

import com.zuplae.filmes.model.Serie;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SerieRepository extends PagingAndSortingRepository<Serie,Integer> {
    
}
