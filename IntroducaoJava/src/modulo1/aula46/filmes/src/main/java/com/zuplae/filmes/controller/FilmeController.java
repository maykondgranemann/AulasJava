package com.zuplae.filmes.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmeController {

    @GetMapping("/filme")
    public String filmes(HttpServletRequest req){
        req.setAttribute("nome", "Esqueceram de mim");
        return "filmes";
    }
}
