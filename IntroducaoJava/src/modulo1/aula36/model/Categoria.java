package model;

public class Categoria {
    private int id;
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }
    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String retorno = String.format("%d - %s", this.id, this.nome);
        return retorno;
    }
}
