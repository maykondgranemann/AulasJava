package controller;

import java.util.ArrayList;

import model.Produto;

public class ProdutoController {
    private ArrayList<Produto> produtos =  new ArrayList<Produto>();


    public void salvar(Produto p){
        this.produtos.add(p);
    }

    public ArrayList<Produto> listar(){
        return produtos;
    }
}
