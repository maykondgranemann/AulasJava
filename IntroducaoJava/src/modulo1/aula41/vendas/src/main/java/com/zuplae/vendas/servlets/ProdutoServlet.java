package com.zuplae.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.zuplae.vendas.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Produto prod1 = new Produto();

        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroIdcategoria = req.getParameter("id_categoria");

        prod1.setNome(nome);
        
        if(parametroValor != null && parametroIdcategoria != null){
            prod1.setValor(Float.parseFloat(parametroValor));
            prod1.setIdCategoria(Integer.parseInt(parametroIdcategoria));
            out.printf("Modulo Produtos - ProdModel = %s - %.2f - %d", prod1.getNome(), prod1.getValor(), prod1.getIdCategoria());
        }
        else{
            out.printf("Modulo Produtos - ProdModel = %s", prod1.getNome());
        }   
    }
}
