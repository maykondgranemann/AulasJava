package P5.EX1;

public class Aluno {
    private String nomeCompleto;
    private int idade;
    private String matricula;

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {

        String objToString = this.nomeCompleto 
        + " " + this.idade 
        + " " + this.matricula;
        
        return objToString;
    }
}
