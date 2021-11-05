package P5.ex2;

public class PontoTuristico {
    public String nome;
    public String descricao;
    public String localizacao;

    @Override
    public String toString() {        
        return String.format("%s;%s;%s", this.nome, this.descricao, this.localizacao);
    }
}
