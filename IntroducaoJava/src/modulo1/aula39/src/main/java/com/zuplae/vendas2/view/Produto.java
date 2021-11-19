package com.zuplae.vendas2.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<String> produtos = new ArrayList<String>();
		produtos.add("Tv");
		produtos.add("Celular");
		produtos.add("Computador");
		
		PrintWriter out = resp.getWriter();	
	
		for (String p : produtos) {
			out.printf("<h1>%s</h1>", p);
		}
	}
}
