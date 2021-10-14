package controller;

import java.util.ArrayList;

import model.Artista;

public class ArtistaController {
    private ArrayList<Artista> artistas = new ArrayList<Artista>();

    public void salvar(Artista a){
        artistas.add(a);
    }

    public ArrayList<Artista> listar(){
        return artistas;
    }
}
