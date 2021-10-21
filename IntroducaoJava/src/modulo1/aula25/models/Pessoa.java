package models;

public abstract class Pessoa extends Base{ // Heranca
    public String nome;
    public Endereco enderecoResidencial; // Composicao
    public Endereco enderecoComercial;
}
