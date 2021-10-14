package controller;

import java.util.ArrayList;

import model.Categoria;

public class CategoriaController {
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();

    public void salvar(Categoria c){
        categorias.add(c);
    }

    public ArrayList<Categoria> listar(){
        return categorias;
    }
}
