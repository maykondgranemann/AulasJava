package com.zuplae.vendas2.view;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pessoa")
public class Pessoa extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome1 = "Inês Brasil";
		
		RequestDispatcher rd = req.getRequestDispatcher("pessoa.jsp");
		req.setAttribute("nome", nome1 );
		rd.forward(req, resp);
	}
}
