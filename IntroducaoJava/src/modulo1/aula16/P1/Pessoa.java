package P1;

public class Pessoa {
    private String nome;
    private String sobrenome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        String mensagem = this.nome + " " + this.sobrenome;
        return mensagem;
    }
}
