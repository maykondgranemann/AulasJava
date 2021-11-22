import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroIdcategoria = req.getParameter("id_categoria");
        
        if(parametroValor != null && parametroIdcategoria != null){
            float valor = Float.parseFloat(parametroValor);
            int id_categoria = Integer.parseInt(parametroIdcategoria);
            out.printf("Modulo Produtos - Prod = %s - %.2f - %d", nome, valor, id_categoria);
        }
        else{
            out.printf("Modulo Produtos - Prod = %s", nome);
        }   
    }
}
