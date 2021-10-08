package P3.modelo;

public class Pessoa extends Base {
    private String nome;
    private String sobrenome;

    public Pessoa(int id) {
        super(id);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {        
        return this.getId() + "-" + this.nome + " - " +  this.sobrenome;
    }
}
