package com.zuplae.filmes.repository;

import com.zuplae.filmes.model.Genero;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GeneroRepository extends PagingAndSortingRepository<Genero,Integer>{
    
}
