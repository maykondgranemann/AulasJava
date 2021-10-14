package view;

import controller.CategoriaController;
import model.Categoria;

public class CategoriaView {
    
    public void executa() {
        CategoriaController controller = new CategoriaController();

        Categoria categoria1 = new Categoria();
        categoria1.nome = "Tvs";
        categoria1.descricao = "Tvs até 32\"";

        controller.salvar(categoria1);
        
        for (Categoria cat : controller.listar()) {
            System.out.println(cat.nome);
            System.out.println(cat.descricao);
        }        
    }
}
