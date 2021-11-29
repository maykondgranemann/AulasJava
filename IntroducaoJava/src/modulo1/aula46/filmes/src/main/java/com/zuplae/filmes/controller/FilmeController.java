package com.zuplae.filmes.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zuplae.filmes.model.Filme;
import com.zuplae.filmes.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmeController {
    private FilmeRepository repository;

    public FilmeController(FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/filme")
    public String filmes(HttpServletRequest req){
        List<Filme> lista = (List<Filme>)repository.findAll();
        req.setAttribute("filmes", lista);
        return "filmes";
        
    }

    @GetMapping("/filme/form")
    public String formulario(){
        return "filmes-form";
    }

    @PostMapping("/filme/salvar")    
    public String salvar(Filme model){
        repository.save(model);
        return "redirect:/filme";
    }
}
