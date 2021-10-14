package view;

import java.util.ArrayList;

import controller.ProdutoController;
import model.Produto;

public class ProdutoView {
    
    public void executa() {
        Produto p = new Produto("Tv", 1999.99);

        p.setMarca("Samsung");
        
        ProdutoController controller = new ProdutoController();
        controller.salvar(p);
        ArrayList<Produto> prods = controller.listar();

        for (Produto prodSalvo : prods ) {
            System.out.println(prodSalvo);
        }
        
    }
}
