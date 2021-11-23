package com.zuplae.vendas.models;

public class Produto {
    private String nome;
    private float valor;
    private int idCategoria;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public int getIdCategoria() {
        return idCategoria;
    }
}
