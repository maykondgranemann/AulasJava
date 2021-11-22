package com.zuplae.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.zuplae.vendas.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria cat1 = new Categoria();

        cat1.setNome(req.getParameter("nome"));
        cat1.setDescricao(req.getParameter("descricao"));

        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria -- CategoriaModel = %s - %s", cat1.getNome(), cat1.getDescricao() );
    }
    
}
